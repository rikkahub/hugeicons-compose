package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Touch10: ImageVector
    get() {
        if (_touch10 != null) {
            return _touch10!!
        }
        _touch10 = ImageVector.Builder(
            name = "Touch10",
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
        moveTo(6.5f, 21f)
        lineTo(6.5f, 11.5f)
        curveTo(6.5f, 8.46243f, 8.96243f, 6f, 12f, 6f)
        curveTo(15.0376f, 6f, 17.5f, 8.46243f, 17.5f, 11.5f)
        lineTo(17.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 13f)
        verticalLineTo(12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        curveTo(16.9706f, 3f, 21f, 7.02944f, 21f, 12f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 11.5f)
        curveTo(14.5f, 10.1193f, 13.3807f, 9f, 12f, 9f)
        curveTo(10.6193f, 9f, 9.5f, 10.1193f, 9.5f, 11.5f)
        verticalLineTo(12.75f)
        curveTo(9.5f, 13.4404f, 10.0596f, 14f, 10.75f, 14f)
        horizontalLineTo(13.25f)
        curveTo(13.9404f, 14f, 14.5f, 13.4404f, 14.5f, 12.75f)
        verticalLineTo(11.5f)
        }
        }.build()

        return _touch10!!
    }

private var _touch10: ImageVector? = null
