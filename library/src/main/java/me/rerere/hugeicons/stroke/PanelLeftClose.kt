package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PanelLeftClose: ImageVector
    get() {
        if (_panelLeftClose != null) {
            return _panelLeftClose!!
        }
        _panelLeftClose = ImageVector.Builder(
            name = "PanelLeftClose",
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
        moveTo(21f, 11f)
        curveTo(21f, 7.22876f, 21f, 5.34315f, 19.8284f, 4.17157f)
        curveTo(18.6569f, 3f, 16.7712f, 3f, 13f, 3f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 3f, 5.34315f, 3f, 4.17157f, 4.17157f)
        curveTo(3f, 5.34315f, 3f, 7.22876f, 3f, 11f)
        verticalLineTo(13f)
        curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
        curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 21f, 18.6569f, 21f, 19.8284f, 19.8284f)
        curveTo(21f, 18.6569f, 21f, 16.7712f, 21f, 13f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 3f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9f)
        lineTo(15.1082f, 9.87868f)
        curveTo(16.3694f, 10.8787f, 17f, 11.3787f, 17f, 12f)
        curveTo(17f, 12.6213f, 16.3694f, 13.1213f, 15.1082f, 14.1213f)
        lineTo(14f, 15f)
        }
        }.build()

        return _panelLeftClose!!
    }

private var _panelLeftClose: ImageVector? = null
