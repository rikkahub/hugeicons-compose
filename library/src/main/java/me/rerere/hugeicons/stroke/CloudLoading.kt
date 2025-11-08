package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudLoading: ImageVector
    get() {
        if (_cloudLoading != null) {
            return _cloudLoading!!
        }
        _cloudLoading = ImageVector.Builder(
            name = "CloudLoading",
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
        moveTo(17.4776f, 9.00005f)
        curveTo(17.485f, 9.00002f, 17.4925f, 9f, 17.5f, 9f)
        curveTo(19.9853f, 9f, 22f, 11.0147f, 22f, 13.5f)
        curveTo(22f, 15.9853f, 19.9853f, 18f, 17.5f, 18f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 18f, 2f, 15.7614f, 2f, 13f)
        curveTo(2f, 10.4003f, 3.98398f, 8.26407f, 6.52042f, 8.0227f)
        moveTo(17.4776f, 9.00005f)
        curveTo(17.4924f, 8.83536f, 17.5f, 8.66856f, 17.5f, 8.5f)
        curveTo(17.5f, 5.46243f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.20862f, 6.52042f, 8.0227f)
        moveTo(17.4776f, 9.00005f)
        curveTo(17.3753f, 10.1345f, 16.9286f, 11.1696f, 16.2428f, 12f)
        moveTo(6.52042f, 8.0227f)
        curveTo(6.67826f, 8.00768f, 6.83823f, 8f, 7f, 8f)
        curveTo(8.12582f, 8f, 9.16474f, 8.37209f, 10.0005f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 21f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 21f)
        horizontalLineTo(18f)
        }
        }.build()

        return _cloudLoading!!
    }

private var _cloudLoading: ImageVector? = null
