package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = ImageVector.Builder(
            name = "Sunglasses",
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
        moveTo(9f, 16f)
        curveTo(9.83563f, 16.6278f, 10.8744f, 16.9998f, 12f, 16.9998f)
        curveTo(13.1256f, 16.9998f, 14.1644f, 16.6278f, 15f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 9.5f)
        curveTo(9f, 8f, 6f, 7.99999f, 4f, 8f)
        curveTo(4f, 8f, 4f, 13f, 7f, 13f)
        curveTo(9.5f, 13f, 11.5f, 9.5f, 11.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 9.5f)
        curveTo(15f, 8f, 18f, 7.99999f, 20f, 8f)
        curveTo(20f, 8f, 20f, 13f, 17f, 13f)
        curveTo(14.5f, 13f, 12.5f, 9.5f, 12.5f, 9.5f)
        }
        }.build()

        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
