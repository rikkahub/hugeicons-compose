package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Directions01: ImageVector
    get() {
        if (_directions01 != null) {
            return _directions01!!
        }
        _directions01 = ImageVector.Builder(
            name = "Directions01",
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
        moveTo(4.91872f, 4.43926f)
        curveTo(5.46116f, 3.73152f, 5.73238f, 3.37764f, 6.10315f, 3.18882f)
        curveTo(6.47393f, 3f, 6.89759f, 3f, 7.74491f, 3f)
        horizontalLineTo(10.1606f)
        curveTo(11.0277f, 3f, 11.4612f, 3f, 11.7306f, 3.29289f)
        curveTo(12f, 3.58579f, 12f, 4.05719f, 12f, 5f)
        verticalLineTo(9f)
        horizontalLineTo(7.74491f)
        curveTo(6.89759f, 9f, 6.47393f, 9f, 6.10315f, 8.81118f)
        curveTo(5.73238f, 8.62236f, 5.46116f, 8.26848f, 4.91872f, 7.56074f)
        lineTo(4.70383f, 7.28037f)
        curveTo(4.23461f, 6.66816f, 4f, 6.36205f, 4f, 6f)
        curveTo(4f, 5.63795f, 4.23461f, 5.33184f, 4.70383f, 4.71963f)
        lineTo(4.91872f, 4.43926f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.0813f, 9.43926f)
        curveTo(18.5388f, 8.73152f, 18.2676f, 8.37764f, 17.8968f, 8.18882f)
        curveTo(17.5261f, 8f, 17.1024f, 8f, 16.2551f, 8f)
        horizontalLineTo(12f)
        verticalLineTo(14f)
        horizontalLineTo(16.2551f)
        curveTo(17.1024f, 14f, 17.5261f, 14f, 17.8968f, 13.8112f)
        curveTo(18.2676f, 13.6224f, 18.5388f, 13.2685f, 19.0813f, 12.5607f)
        lineTo(19.2962f, 12.2804f)
        curveTo(19.7654f, 11.6682f, 20f, 11.362f, 20f, 11f)
        curveTo(20f, 10.638f, 19.7654f, 10.3318f, 19.2962f, 9.71963f)
        lineTo(19.0813f, 9.43926f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21f)
        lineTo(12f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 21f)
        horizontalLineTo(15f)
        }
        }.build()

        return _directions01!!
    }

private var _directions01: ImageVector? = null
