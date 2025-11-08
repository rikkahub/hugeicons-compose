package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DimSum01: ImageVector
    get() {
        if (_dimSum01 != null) {
            return _dimSum01!!
        }
        _dimSum01 = ImageVector.Builder(
            name = "DimSum01",
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
        moveTo(13.5f, 8.5f)
        lineTo(22f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        lineTo(22f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5525f, 12.6975f)
        curveTo(15.2987f, 12.0688f, 14.9493f, 11.4609f, 14.5214f, 10.9028f)
        curveTo(12.5803f, 8.57474f, 12.0206f, 6.80237f, 12.0171f, 6f)
        curveTo(11.9582f, 7.60728f, 9.99859f, 8.47735f, 9.012f, 7f)
        curveTo(8.02541f, 8.47735f, 6.06578f, 7.60728f, 6.00686f, 6f)
        curveTo(6.00336f, 6.80237f, 5.44368f, 8.57474f, 3.50257f, 10.9028f)
        curveTo(2.56153f, 12.1304f, 2f, 13.5985f, 2f, 15f)
        curveTo(2f, 18.3137f, 5.13938f, 21f, 9.012f, 21f)
        curveTo(12.6878f, 21f, 15.7031f, 18.5798f, 16f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 10.5f)
        lineTo(7f, 11.5f)
        moveTo(10.5f, 10.5f)
        lineTo(11f, 11.5f)
        }
        }.build()

        return _dimSum01!!
    }

private var _dimSum01: ImageVector? = null
