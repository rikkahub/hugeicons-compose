package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tongue: ImageVector
    get() {
        if (_tongue != null) {
            return _tongue!!
        }
        _tongue = ImageVector.Builder(
            name = "Tongue",
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
        moveTo(19.651f, 12f)
        curveTo(20.8221f, 10.8862f, 21.575f, 9.47282f, 21.9097f, 8.75609f)
        curveTo(21.9772f, 8.61153f, 22f, 8.45289f, 22f, 8.29412f)
        moveTo(4.34904f, 12f)
        curveTo(3.17787f, 10.8862f, 2.42496f, 9.47282f, 2.09032f, 8.75609f)
        curveTo(2.02282f, 8.61153f, 2f, 8.45289f, 2f, 8.29412f)
        moveTo(22f, 8.29412f)
        lineTo(19f, 8.29412f)
        moveTo(22f, 8.29412f)
        curveTo(22f, 8.13586f, 21.9775f, 7.97737f, 21.9102f, 7.83323f)
        curveTo(21.3088f, 6.54493f, 19.3535f, 3f, 16.0442f, 3f)
        curveTo(15.0038f, 3f, 14.1347f, 3.53814f, 13.4722f, 4.17142f)
        curveTo(12.9083f, 4.71045f, 12.6262f, 4.98002f, 12.564f, 5.0238f)
        curveTo(12.0334f, 5.39734f, 11.9666f, 5.39734f, 11.436f, 5.0238f)
        curveTo(11.3738f, 4.98002f, 11.0917f, 4.71045f, 10.5278f, 4.17142f)
        curveTo(9.86525f, 3.53814f, 8.99617f, 3f, 7.9558f, 3f)
        curveTo(4.64648f, 3f, 2.69115f, 6.54493f, 2.08981f, 7.83323f)
        curveTo(2.02253f, 7.97737f, 2f, 8.13586f, 2f, 8.29412f)
        moveTo(2f, 8.29412f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        lineTo(12.2702f, 8.72635f)
        curveTo(12.7293f, 8.26127f, 13.352f, 8f, 14.0014f, 8f)
        curveTo(15.1414f, 8f, 16.1306f, 8.79706f, 16.387f, 9.92227f)
        lineTo(17.3568f, 14.1793f)
        curveTo(18.1518f, 17.6686f, 15.5354f, 21f, 12f, 21f)
        curveTo(8.46456f, 21f, 5.84819f, 17.6686f, 6.64316f, 14.1793f)
        lineTo(7.61303f, 9.92227f)
        curveTo(7.86938f, 8.79706f, 8.85856f, 8f, 9.99863f, 8f)
        curveTo(10.648f, 8f, 11.2707f, 8.26127f, 11.7298f, 8.72635f)
        lineTo(12f, 9f)
        moveTo(12f, 9f)
        verticalLineTo(12f)
        }
        }.build()

        return _tongue!!
    }

private var _tongue: ImageVector? = null
