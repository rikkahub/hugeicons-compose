package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = ImageVector.Builder(
            name = "Walking",
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
        moveTo(6f, 12.5f)
        lineTo(7.73811f, 9.89287f)
        curveTo(7.91034f, 9.63452f, 8.14035f, 9.41983f, 8.40993f, 9.26578f)
        lineTo(10.599f, 8.01487f)
        curveTo(11.1619f, 7.69323f, 11.8483f, 7.67417f, 12.4282f, 7.9641f)
        curveTo(13.0851f, 8.29255f, 13.4658f, 8.98636f, 13.7461f, 9.66522f)
        curveTo(14.2069f, 10.7814f, 15.3984f, 12f, 18f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 9f)
        lineTo(11.7772f, 14.5951f)
        moveTo(10.5f, 8.5f)
        lineTo(9.77457f, 11.7645f)
        curveTo(9.6069f, 12.519f, 9.88897f, 13.3025f, 10.4991f, 13.777f)
        lineTo(14f, 16.5f)
        lineTo(15.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 16f)
        lineTo(9f, 17.5f)
        lineTo(6.5f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 4.5f)
        curveTo(15f, 5.32843f, 14.3284f, 6f, 13.5f, 6f)
        curveTo(12.6716f, 6f, 12f, 5.32843f, 12f, 4.5f)
        curveTo(12f, 3.67157f, 12.6716f, 3f, 13.5f, 3f)
        curveTo(14.3284f, 3f, 15f, 3.67157f, 15f, 4.5f)
        }
        }.build()

        return _walking!!
    }

private var _walking: ImageVector? = null
