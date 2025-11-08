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
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.4572f, 5.90692f)
        lineTo(9.5343f, 3.83293f)
        curveTo(7.52036f, 2.76817f, 6.51339f, 2.23579f, 5.75669f, 2.62971f)
        curveTo(5f, 3.02362f, 5f, 4.08019f, 5f, 6.19334f)
        verticalLineTo(8.26734f)
        curveTo(5f, 9.55553f, 5f, 10.1996f, 5.44155f, 10.5998f)
        curveTo(5.8831f, 11f, 6.59376f, 11f, 8.01508f, 11f)
        horizontalLineTo(11.9379f)
        curveTo(16.4249f, 11f, 18.6683f, 11f, 18.9695f, 9.99025f)
        curveTo(19.2707f, 8.98051f, 17.3329f, 7.95598f, 13.4572f, 5.90692f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.4572f, 19.0931f)
        lineTo(9.5343f, 21.1671f)
        curveTo(7.52036f, 22.2318f, 6.51339f, 22.7642f, 5.75669f, 22.3703f)
        curveTo(5f, 21.9764f, 5f, 20.9198f, 5f, 18.8067f)
        verticalLineTo(16.7327f)
        curveTo(5f, 15.4445f, 5f, 14.8004f, 5.44155f, 14.4002f)
        curveTo(5.8831f, 14f, 6.59376f, 14f, 8.01508f, 14f)
        horizontalLineTo(11.9379f)
        curveTo(16.4249f, 14f, 18.6683f, 14f, 18.9695f, 15.0097f)
        curveTo(19.2707f, 16.0195f, 17.3329f, 17.044f, 13.4572f, 19.0931f)
        }
        }.build()

        return _imageFlipVertical!!
    }

private var _imageFlipVertical: ImageVector? = null
