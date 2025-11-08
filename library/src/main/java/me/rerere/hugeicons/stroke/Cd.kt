package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cd: ImageVector
    get() {
        if (_cd != null) {
            return _cd!!
        }
        _cd = ImageVector.Builder(
            name = "Cd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 15.9897f)
        curveTo(6.89898f, 16.5649f, 7.38193f, 17.0746f, 7.93053f, 17.5f)
        moveTo(16.0261f, 6.5f)
        curveTo(16.5947f, 6.94079f, 17.0928f, 7.47217f, 17.5f, 8.07321f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 12f)
        curveTo(14.5f, 10.6193f, 13.3807f, 9.5f, 12f, 9.5f)
        curveTo(10.6193f, 9.5f, 9.5f, 10.6193f, 9.5f, 12f)
        curveTo(9.5f, 13.3807f, 10.6193f, 14.5f, 12f, 14.5f)
        curveTo(13.3807f, 14.5f, 14.5f, 13.3807f, 14.5f, 12f)
        }
        }.build()

        return _cd!!
    }

private var _cd: ImageVector? = null
