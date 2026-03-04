package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageFlipVertical: ImageVector
    get() {
        if (_imageFlipVertical != null) {
            return _imageFlipVertical!!
        }
        _imageFlipVertical = ImageVector.Builder(
            name = "ImageFlipVertical",
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
        moveTo(13.4572f, 5.40692f)
        lineTo(9.5343f, 3.33293f)
        curveTo(7.52036f, 2.26817f, 6.51339f, 1.73579f, 5.75669f, 2.12971f)
        curveTo(5f, 2.52362f, 5f, 3.58019f, 5f, 5.69334f)
        verticalLineTo(7.76734f)
        curveTo(5f, 9.05553f, 5f, 9.69962f, 5.44155f, 10.0998f)
        curveTo(5.8831f, 10.5f, 6.59376f, 10.5f, 8.01508f, 10.5f)
        horizontalLineTo(11.9379f)
        curveTo(16.4249f, 10.5f, 18.6683f, 10.5f, 18.9695f, 9.49025f)
        curveTo(19.2707f, 8.48051f, 17.3329f, 7.45598f, 13.4572f, 5.40692f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.4572f, 18.5931f)
        lineTo(9.5343f, 20.6671f)
        curveTo(7.52036f, 21.7318f, 6.51339f, 22.2642f, 5.75669f, 21.8703f)
        curveTo(5f, 21.4764f, 5f, 20.4198f, 5f, 18.3067f)
        verticalLineTo(16.2327f)
        curveTo(5f, 14.9445f, 5f, 14.3004f, 5.44155f, 13.9002f)
        curveTo(5.8831f, 13.5f, 6.59376f, 13.5f, 8.01508f, 13.5f)
        horizontalLineTo(11.9379f)
        curveTo(16.4249f, 13.5f, 18.6683f, 13.5f, 18.9695f, 14.5097f)
        curveTo(19.2707f, 15.5195f, 17.3329f, 16.544f, 13.4572f, 18.5931f)
        }
        }.build()

        return _imageFlipVertical!!
    }

private var _imageFlipVertical: ImageVector? = null
