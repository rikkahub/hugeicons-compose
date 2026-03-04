package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PanelRightClose: ImageVector
    get() {
        if (_panelRightClose != null) {
            return _panelRightClose!!
        }
        _panelRightClose = ImageVector.Builder(
            name = "PanelRightClose",
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
        moveTo(3f, 11f)
        curveTo(3f, 7.22876f, 3f, 5.34315f, 4.17157f, 4.17157f)
        curveTo(5.34315f, 3f, 7.22876f, 3f, 11f, 3f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 3f, 18.6569f, 3f, 19.8284f, 4.17157f)
        curveTo(21f, 5.34315f, 21f, 7.22876f, 21f, 11f)
        verticalLineTo(13f)
        curveTo(21f, 16.7712f, 21f, 18.6569f, 19.8284f, 19.8284f)
        curveTo(18.6569f, 21f, 16.7712f, 21f, 13f, 21f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 21f, 5.34315f, 21f, 4.17157f, 19.8284f)
        curveTo(3f, 18.6569f, 3f, 16.7712f, 3f, 13f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 3f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        lineTo(9.10819f, 9.87868f)
        curveTo(10.3694f, 10.8787f, 11f, 11.3787f, 11f, 12f)
        curveTo(11f, 12.6213f, 10.3694f, 13.1213f, 9.10819f, 14.1213f)
        lineTo(8f, 15f)
        }
        }.build()

        return _panelRightClose!!
    }

private var _panelRightClose: ImageVector? = null
