package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
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
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
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
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4996f, 9f)
        horizontalLineTo(12.5086f)
        moveTo(17f, 3.95174f)
        curveTo(15.8483f, 2.74585f, 14.2574f, 2f, 12.5f, 2f)
        curveTo(10.7426f, 2f, 9.15165f, 2.74585f, 8f, 3.95174f)
        moveTo(10.25f, 6.30769f)
        curveTo(10.8258f, 5.70475f, 11.6213f, 5.33182f, 12.5f, 5.33182f)
        curveTo(13.3787f, 5.33182f, 14.1742f, 5.70475f, 14.75f, 6.30769f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9998f, 17f)
        horizontalLineTo(18.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9998f, 17f)
        horizontalLineTo(14.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 17f)
        horizontalLineTo(10f)
        }
        }.build()

        return _router!!
    }

private var _router: ImageVector? = null
