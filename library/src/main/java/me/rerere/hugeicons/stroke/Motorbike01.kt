package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Motorbike01: ImageVector
    get() {
        if (_motorbike01 != null) {
            return _motorbike01!!
        }
        _motorbike01 = ImageVector.Builder(
            name = "Motorbike01",
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
        moveTo(14.416f, 18f)
        curveTo(14.1484f, 17.3875f, 14f, 16.7111f, 14f, 16f)
        curveTo(14f, 13.2386f, 16.2386f, 11f, 19f, 11f)
        curveTo(19.3425f, 11f, 19.6769f, 11.0344f, 20f, 11.1f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.43023f, 9.62979f)
        horizontalLineTo(8.15662f)
        curveTo(8.61216f, 9.62979f, 9.05405f, 9.47428f, 9.40918f, 9.18898f)
        lineTo(11.2373f, 7.7204f)
        curveTo(11.4148f, 7.57776f, 11.6358f, 7.5f, 11.8636f, 7.5f)
        horizontalLineTo(15f)
        lineTo(12.2843f, 12.4789f)
        curveTo(12.109f, 12.8001f, 11.7723f, 13f, 11.4064f, 13f)
        horizontalLineTo(9.5f)
        moveTo(6.43023f, 9.62979f)
        horizontalLineTo(4f)
        moveTo(6.43023f, 9.62979f)
        lineTo(9.5f, 13f)
        moveTo(9.5f, 13f)
        lineTo(7f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 11f)
        lineTo(13.9923f, 5.73649f)
        curveTo(13.5873f, 5.02784f, 13.3849f, 4.67352f, 13.0835f, 4.43408f)
        curveTo(12.9313f, 4.31313f, 12.7622f, 4.21503f, 12.5817f, 4.14287f)
        curveTo(12.2243f, 4f, 11.8162f, 4f, 11f, 4f)
        }
        }.build()

        return _motorbike01!!
    }

private var _motorbike01: ImageVector? = null
