package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.QuoteDown: ImageVector
    get() {
        if (_quoteDown != null) {
            return _quoteDown!!
        }
        _quoteDown = ImageVector.Builder(
            name = "QuoteDown",
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
        moveTo(10f, 8f)
        curveTo(10f, 9.88562f, 10f, 10.8284f, 9.41421f, 11.4142f)
        curveTo(8.82843f, 12f, 7.88562f, 12f, 6f, 12f)
        curveTo(4.11438f, 12f, 3.17157f, 12f, 2.58579f, 11.4142f)
        curveTo(2f, 10.8284f, 2f, 9.88562f, 2f, 8f)
        curveTo(2f, 6.11438f, 2f, 5.17157f, 2.58579f, 4.58579f)
        curveTo(3.17157f, 4f, 4.11438f, 4f, 6f, 4f)
        curveTo(7.88562f, 4f, 8.82843f, 4f, 9.41421f, 4.58579f)
        curveTo(10f, 5.17157f, 10f, 6.11438f, 10f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7f)
        lineTo(10f, 11.4821f)
        curveTo(10f, 15.4547f, 7.48429f, 18.8237f, 4f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 8f)
        curveTo(22f, 9.88562f, 22f, 10.8284f, 21.4142f, 11.4142f)
        curveTo(20.8284f, 12f, 19.8856f, 12f, 18f, 12f)
        curveTo(16.1144f, 12f, 15.1716f, 12f, 14.5858f, 11.4142f)
        curveTo(14f, 10.8284f, 14f, 9.88562f, 14f, 8f)
        curveTo(14f, 6.11438f, 14f, 5.17157f, 14.5858f, 4.58579f)
        curveTo(15.1716f, 4f, 16.1144f, 4f, 18f, 4f)
        curveTo(19.8856f, 4f, 20.8284f, 4f, 21.4142f, 4.58579f)
        curveTo(22f, 5.17157f, 22f, 6.11438f, 22f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7f)
        lineTo(22f, 11.4821f)
        curveTo(22f, 15.4547f, 19.4843f, 18.8237f, 16f, 20f)
        }
        }.build()

        return _quoteDown!!
    }

private var _quoteDown: ImageVector? = null
