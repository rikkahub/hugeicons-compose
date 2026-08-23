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

val HugeIcons.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = ImageVector.Builder(
            name = "Router",
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
            moveTo(17.5f, 22f)
            horizontalLineTo(6.5f)
            curveTo(4.62513f, 22f, 3.6877f, 22f, 3.03054f, 21.4695f)
            curveTo(2.8183f, 21.2982f, 2.63166f, 21.0908f, 2.47746f, 20.855f)
            curveTo(2f, 20.1248f, 2f, 19.0832f, 2f, 17f)
            curveTo(2f, 14.9168f, 2f, 13.8752f, 2.47746f, 13.145f)
            curveTo(2.63166f, 12.9092f, 2.8183f, 12.7018f, 3.03054f, 12.5305f)
            curveTo(3.6877f, 12f, 4.62513f, 12f, 6.5f, 12f)
            horizontalLineTo(17.5f)
            curveTo(19.3749f, 12f, 20.3123f, 12f, 20.9695f, 12.5305f)
            curveTo(21.1817f, 12.7018f, 21.3683f, 12.9092f, 21.5225f, 13.145f)
            curveTo(22f, 13.8752f, 22f, 14.9168f, 22f, 17f)
            curveTo(22f, 19.0832f, 22f, 20.1248f, 21.5225f, 20.855f)
            curveTo(21.3683f, 21.0908f, 21.1817f, 21.2982f, 20.9695f, 21.4695f)
            curveTo(20.3123f, 22f, 19.3749f, 22f, 17.5f, 22f)
            close()
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.4576f, 4.46973f)
            curveTo(16.7437f, 4.76928f, 17.2184f, 4.7802f, 17.518f, 4.49412f)
            curveTo(17.8175f, 4.20804f, 17.8285f, 3.7333f, 17.5424f, 3.43374f)
            lineTo(17f, 3.95174f)
            lineTo(16.4576f, 4.46973f)
            close()
            moveTo(9.70761f, 5.7897f)
            curveTo(9.42153f, 6.08925f, 9.43245f, 6.564f, 9.73201f, 6.85008f)
            curveTo(10.0316f, 7.13616f, 10.5063f, 7.12524f, 10.7924f, 6.82569f)
            lineTo(10.25f, 6.30769f)
            lineTo(9.70761f, 5.7897f)
            close()
            moveTo(7.45761f, 3.43374f)
            curveTo(7.17153f, 3.7333f, 7.18245f, 4.20804f, 7.48201f, 4.49412f)
            curveTo(7.78156f, 4.7802f, 8.25631f, 4.76928f, 8.54239f, 4.46973f)
            lineTo(8f, 3.95174f)
            lineTo(7.45761f, 3.43374f)
            close()
            moveTo(14.2076f, 6.82569f)
            curveTo(14.4937f, 7.12524f, 14.9684f, 7.13616f, 15.268f, 6.85008f)
            curveTo(15.5675f, 6.564f, 15.5785f, 6.08925f, 15.2924f, 5.7897f)
            lineTo(14.75f, 6.30769f)
            lineTo(14.2076f, 6.82569f)
            close()
            moveTo(12.5496f, 9.75039f)
            curveTo(12.9638f, 9.75039f, 13.2996f, 9.41461f, 13.2996f, 9.00039f)
            curveTo(13.2996f, 8.58618f, 12.9638f, 8.25039f, 12.5496f, 8.25039f)
            verticalLineTo(9.00039f)
            verticalLineTo(9.75039f)
            close()
            moveTo(12.4996f, 8.25039f)
            curveTo(12.0854f, 8.25039f, 11.7496f, 8.58618f, 11.7496f, 9.00039f)
            curveTo(11.7496f, 9.41461f, 12.0854f, 9.75039f, 12.4996f, 9.75039f)
            verticalLineTo(9.00039f)
            verticalLineTo(8.25039f)
            close()
            moveTo(17f, 3.95174f)
            lineTo(17.5424f, 3.43374f)
            curveTo(16.2589f, 2.08984f, 14.4759f, 1.25f, 12.5f, 1.25f)
            verticalLineTo(2f)
            verticalLineTo(2.75f)
            curveTo(14.0388f, 2.75f, 15.4378f, 3.40187f, 16.4576f, 4.46973f)
            lineTo(17f, 3.95174f)
            close()
            moveTo(12.5f, 5.33182f)
            verticalLineTo(4.58182f)
            curveTo(11.4028f, 4.58182f, 10.4153f, 5.04873f, 9.70761f, 5.7897f)
            lineTo(10.25f, 6.30769f)
            lineTo(10.7924f, 6.82569f)
            curveTo(11.2364f, 6.36077f, 11.8398f, 6.08182f, 12.5f, 6.08182f)
            verticalLineTo(5.33182f)
            close()
            moveTo(12.5f, 2f)
            verticalLineTo(1.25f)
            curveTo(10.5241f, 1.25f, 8.74108f, 2.08984f, 7.45761f, 3.43374f)
            lineTo(8f, 3.95174f)
            lineTo(8.54239f, 4.46973f)
            curveTo(9.56222f, 3.40187f, 10.9612f, 2.75f, 12.5f, 2.75f)
            verticalLineTo(2f)
            close()
            moveTo(14.75f, 6.30769f)
            lineTo(15.2924f, 5.7897f)
            curveTo(14.5847f, 5.04873f, 13.5972f, 4.58182f, 12.5f, 4.58182f)
            verticalLineTo(5.33182f)
            verticalLineTo(6.08182f)
            curveTo(13.1602f, 6.08182f, 13.7636f, 6.36077f, 14.2076f, 6.82569f)
            lineTo(14.75f, 6.30769f)
            close()
            moveTo(12.5996f, 9.00039f)
            horizontalLineTo(11.8496f)
            curveTo(11.8496f, 8.64141f, 12.1406f, 8.35039f, 12.4996f, 8.35039f)
            verticalLineTo(9.10039f)
            verticalLineTo(9.85039f)
            curveTo(12.969f, 9.85039f, 13.3496f, 9.46984f, 13.3496f, 9.00039f)
            horizontalLineTo(12.5996f)
            close()
            moveTo(12.4996f, 9.10039f)
            verticalLineTo(8.35039f)
            curveTo(12.8586f, 8.35039f, 13.1496f, 8.64141f, 13.1496f, 9.00039f)
            horizontalLineTo(12.3996f)
            horizontalLineTo(11.6496f)
            curveTo(11.6496f, 9.46984f, 12.0302f, 9.85039f, 12.4996f, 9.85039f)
            verticalLineTo(9.10039f)
            close()
            moveTo(12.3996f, 9.00039f)
            horizontalLineTo(13.1496f)
            curveTo(13.1496f, 9.35938f, 12.8586f, 9.65039f, 12.4996f, 9.65039f)
            verticalLineTo(8.90039f)
            verticalLineTo(8.15039f)
            curveTo(12.0302f, 8.15039f, 11.6496f, 8.53095f, 11.6496f, 9.00039f)
            horizontalLineTo(12.3996f)
            close()
            moveTo(12.4996f, 8.90039f)
            verticalLineTo(9.65039f)
            curveTo(12.1406f, 9.65039f, 11.8496f, 9.35938f, 11.8496f, 9.00039f)
            horizontalLineTo(12.5996f)
            horizontalLineTo(13.3496f)
            curveTo(13.3496f, 8.53095f, 12.969f, 8.15039f, 12.4996f, 8.15039f)
            verticalLineTo(8.90039f)
            close()
            moveTo(12.5496f, 9.00039f)
            verticalLineTo(8.25039f)
            horizontalLineTo(12.4996f)
            verticalLineTo(9.00039f)
            verticalLineTo(9.75039f)
            horizontalLineTo(12.5496f)
            verticalLineTo(9.00039f)
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
            moveTo(18.125f, 17f)
            horizontalLineTo(18f)
            moveTo(14.125f, 17f)
            horizontalLineTo(14f)
            moveTo(18.25f, 17f)
            curveTo(18.25f, 17.1381f, 18.1381f, 17.25f, 18f, 17.25f)
            curveTo(17.8619f, 17.25f, 17.75f, 17.1381f, 17.75f, 17f)
            curveTo(17.75f, 16.8619f, 17.8619f, 16.75f, 18f, 16.75f)
            curveTo(18.1381f, 16.75f, 18.25f, 16.8619f, 18.25f, 17f)
            close()
            moveTo(14.25f, 17f)
            curveTo(14.25f, 17.1381f, 14.1381f, 17.25f, 14f, 17.25f)
            curveTo(13.8619f, 17.25f, 13.75f, 17.1381f, 13.75f, 17f)
            curveTo(13.75f, 16.8619f, 13.8619f, 16.75f, 14f, 16.75f)
            curveTo(14.1381f, 16.75f, 14.25f, 16.8619f, 14.25f, 17f)
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
            moveTo(6f, 17f)
            horizontalLineTo(10f)
        }
        }.build()

        return _router!!
    }

private var _router: ImageVector? = null
