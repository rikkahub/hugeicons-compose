package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudAlert: ImageVector
    get() {
        if (_cloudAlert != null) {
            return _cloudAlert!!
        }
        _cloudAlert = ImageVector.Builder(
            name = "CloudAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 13f)
            verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.125f, 20.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 20.75f)
            curveTo(12.25f, 20.8881f, 12.1381f, 21f, 12f, 21f)
            curveTo(11.8619f, 21f, 11.75f, 20.8881f, 11.75f, 20.75f)
            curveTo(11.75f, 20.6119f, 11.8619f, 20.5f, 12f, 20.5f)
            curveTo(12.1381f, 20.5f, 12.25f, 20.6119f, 12.25f, 20.75f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.4776f, 9.00005f)
            curveTo(17.485f, 9.00002f, 17.4925f, 9f, 17.5f, 9f)
            curveTo(19.9853f, 9f, 22f, 11.0147f, 22f, 13.5f)
            curveTo(22f, 15.9853f, 19.9853f, 18f, 17.5f, 18f)
            horizontalLineTo(16f)
            moveTo(17.4776f, 9.00005f)
            curveTo(17.4924f, 8.83536f, 17.5f, 8.66856f, 17.5f, 8.5f)
            curveTo(17.5f, 5.46243f, 15.0376f, 3f, 12f, 3f)
            curveTo(9.12324f, 3f, 6.76233f, 5.20862f, 6.52042f, 8.0227f)
            moveTo(17.4776f, 9.00005f)
            curveTo(17.3753f, 10.1345f, 16.9286f, 11.1696f, 16.2428f, 12f)
            moveTo(6.52042f, 8.0227f)
            curveTo(3.98398f, 8.26407f, 2f, 10.4003f, 2f, 13f)
            curveTo(2f, 15.7614f, 4.23858f, 18f, 7f, 18f)
            horizontalLineTo(8f)
            moveTo(6.52042f, 8.0227f)
            curveTo(6.67826f, 8.00768f, 6.83823f, 8f, 7f, 8f)
            curveTo(8.12582f, 8f, 9.16474f, 8.37209f, 10.0005f, 9f)
        }
        }.build()

        return _cloudAlert!!
    }

private var _cloudAlert: ImageVector? = null
