package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.QuoteUp: ImageVector
    get() {
        if (_quoteUp != null) {
            return _quoteUp!!
        }
        _quoteUp = ImageVector.Builder(
            name = "QuoteUp",
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
        moveTo(14f, 16f)
        curveTo(14f, 14.1144f, 14f, 13.1716f, 14.5858f, 12.5858f)
        curveTo(15.1716f, 12f, 16.1144f, 12f, 18f, 12f)
        curveTo(19.8856f, 12f, 20.8284f, 12f, 21.4142f, 12.5858f)
        curveTo(22f, 13.1716f, 22f, 14.1144f, 22f, 16f)
        curveTo(22f, 17.8856f, 22f, 18.8284f, 21.4142f, 19.4142f)
        curveTo(20.8284f, 20f, 19.8856f, 20f, 18f, 20f)
        curveTo(16.1144f, 20f, 15.1716f, 20f, 14.5858f, 19.4142f)
        curveTo(14f, 18.8284f, 14f, 17.8856f, 14f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 16f)
        verticalLineTo(11.8626f)
        curveTo(14f, 8.19569f, 16.5157f, 5.08584f, 20f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16f)
        curveTo(2f, 14.1144f, 2f, 13.1716f, 2.58579f, 12.5858f)
        curveTo(3.17157f, 12f, 4.11438f, 12f, 6f, 12f)
        curveTo(7.88562f, 12f, 8.82843f, 12f, 9.41421f, 12.5858f)
        curveTo(10f, 13.1716f, 10f, 14.1144f, 10f, 16f)
        curveTo(10f, 17.8856f, 10f, 18.8284f, 9.41421f, 19.4142f)
        curveTo(8.82843f, 20f, 7.88562f, 20f, 6f, 20f)
        curveTo(4.11438f, 20f, 3.17157f, 20f, 2.58579f, 19.4142f)
        curveTo(2f, 18.8284f, 2f, 17.8856f, 2f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16f)
        verticalLineTo(11.8626f)
        curveTo(2f, 8.19569f, 4.51571f, 5.08584f, 8f, 4f)
        }
        }.build()

        return _quoteUp!!
    }

private var _quoteUp: ImageVector? = null
