package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageComposition: ImageVector
    get() {
        if (_imageComposition != null) {
            return _imageComposition!!
        }
        _imageComposition = ImageVector.Builder(
            name = "ImageComposition",
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
        moveTo(7.07523f, 3.88403f)
        curveTo(10.2874f, 4.8348f, 13.7126f, 4.8348f, 16.9248f, 3.88403f)
        curveTo(19.517f, 3.11677f, 20.813f, 2.73313f, 21.4065f, 3.20921f)
        curveTo(22f, 3.68529f, 22f, 4.90772f, 22f, 7.35256f)
        verticalLineTo(16.6474f)
        curveTo(22f, 19.0923f, 22f, 20.3147f, 21.4065f, 20.7908f)
        curveTo(20.813f, 21.2669f, 19.5169f, 20.8832f, 16.9248f, 20.116f)
        curveTo(13.7126f, 19.1652f, 10.2874f, 19.1652f, 7.07523f, 20.116f)
        curveTo(4.48305f, 20.8832f, 3.18696f, 21.2669f, 2.59348f, 20.7908f)
        curveTo(2f, 20.3147f, 2f, 19.0923f, 2f, 16.6474f)
        verticalLineTo(7.35256f)
        curveTo(2f, 4.90772f, 2f, 3.68529f, 2.59348f, 3.20921f)
        curveTo(3.18696f, 2.73313f, 4.48305f, 3.11677f, 7.07523f, 3.88403f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 20f)
        curveTo(10.9469f, 15.8426f, 15.3824f, 10.3291f, 22f, 14.4643f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 8.5f)
        curveTo(9f, 9.32843f, 8.32843f, 10f, 7.5f, 10f)
        curveTo(6.67157f, 10f, 6f, 9.32843f, 6f, 8.5f)
        curveTo(6f, 7.67157f, 6.67157f, 7f, 7.5f, 7f)
        curveTo(8.32843f, 7f, 9f, 7.67157f, 9f, 8.5f)
        }
        }.build()

        return _imageComposition!!
    }

private var _imageComposition: ImageVector? = null
