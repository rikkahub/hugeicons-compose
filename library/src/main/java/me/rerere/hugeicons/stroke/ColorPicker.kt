package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ColorPicker: ImageVector
    get() {
        if (_colorPicker != null) {
            return _colorPicker!!
        }
        _colorPicker = ImageVector.Builder(
            name = "ColorPicker",
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
        moveTo(13.435f, 7f)
        lineTo(7.15915f, 13.2759f)
        moveTo(7.15915f, 13.2759f)
        lineTo(4.82728f, 15.6077f)
        curveTo(3.92569f, 16.5093f, 3.47489f, 16.9601f, 3.23745f, 17.5334f)
        curveTo(3f, 18.1066f, 3f, 18.7441f, 3f, 20.0192f)
        verticalLineTo(21f)
        horizontalLineTo(3.98082f)
        curveTo(5.25586f, 21f, 5.89338f, 21f, 6.46663f, 20.7626f)
        curveTo(7.03988f, 20.5251f, 7.49068f, 20.0743f, 8.39227f, 19.1727f)
        lineTo(14.2891f, 13.2759f)
        moveTo(7.15915f, 13.2759f)
        horizontalLineTo(14.2891f)
        moveTo(14.2891f, 13.2759f)
        lineTo(17f, 10.565f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.2087f, 8.38869f)
        lineTo(20.82f, 10f)
        moveTo(19.2087f, 8.38869f)
        lineTo(20.0705f, 7.52682f)
        curveTo(20.363f, 7.23431f, 20.5093f, 7.08805f, 20.611f, 6.94529f)
        curveTo(21.1297f, 6.21676f, 21.1297f, 5.23953f, 20.611f, 4.511f)
        curveTo(20.5093f, 4.36824f, 20.363f, 4.22198f, 20.0705f, 3.92947f)
        curveTo(19.778f, 3.63697f, 19.6318f, 3.4907f, 19.489f, 3.38905f)
        curveTo(18.7605f, 2.87032f, 17.7832f, 2.87032f, 17.0547f, 3.38905f)
        curveTo(16.912f, 3.4907f, 16.7657f, 3.63695f, 16.4732f, 3.92947f)
        lineTo(15.6113f, 4.79133f)
        moveTo(19.2087f, 8.38869f)
        lineTo(15.6113f, 4.79133f)
        moveTo(14f, 3.18002f)
        lineTo(15.6113f, 4.79133f)
        }
        }.build()

        return _colorPicker!!
    }

private var _colorPicker: ImageVector? = null
