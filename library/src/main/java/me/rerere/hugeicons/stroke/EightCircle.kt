package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EightCircle: ImageVector
    get() {
        if (_eightCircle != null) {
            return _eightCircle!!
        }
        _eightCircle = ImageVector.Builder(
            name = "EightCircle",
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
        moveTo(12.5f, 12f)
        horizontalLineTo(11.5f)
        moveTo(12.5f, 12f)
        curveTo(13.8807f, 12f, 15f, 10.8807f, 15f, 9.5f)
        curveTo(15f, 8.11929f, 13.8807f, 7f, 12.5f, 7f)
        horizontalLineTo(11.5f)
        curveTo(10.1193f, 7f, 9f, 8.11929f, 9f, 9.5f)
        curveTo(9f, 10.8807f, 10.1193f, 12f, 11.5f, 12f)
        moveTo(12.5f, 12f)
        curveTo(13.8807f, 12f, 15f, 13.1193f, 15f, 14.5f)
        curveTo(15f, 15.8807f, 13.8807f, 17f, 12.5f, 17f)
        horizontalLineTo(11.5f)
        curveTo(10.1193f, 17f, 9f, 15.8807f, 9f, 14.5f)
        curveTo(9f, 13.1193f, 10.1193f, 12f, 11.5f, 12f)
        }

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
        }.build()

        return _eightCircle!!
    }

private var _eightCircle: ImageVector? = null
