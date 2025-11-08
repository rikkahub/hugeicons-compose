package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BreastPump: ImageVector
    get() {
        if (_breastPump != null) {
            return _breastPump!!
        }
        _breastPump = ImageVector.Builder(
            name = "BreastPump",
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
        moveTo(11.2143f, 22f)
        horizontalLineTo(13.7857f)
        curveTo(15.3951f, 22f, 16.1998f, 22f, 16.747f, 21.5637f)
        curveTo(16.8641f, 21.4703f, 16.9703f, 21.3641f, 17.0637f, 21.247f)
        curveTo(17.5f, 20.6998f, 17.5f, 19.8951f, 17.5f, 18.2857f)
        verticalLineTo(14f)
        curveTo(17.5f, 11.2386f, 15.2614f, 9f, 12.5f, 9f)
        curveTo(9.73858f, 9f, 7.5f, 11.2386f, 7.5f, 14f)
        verticalLineTo(18.2857f)
        curveTo(7.5f, 19.8951f, 7.5f, 20.6998f, 7.93634f, 21.247f)
        curveTo(8.02971f, 21.3641f, 8.13594f, 21.4703f, 8.25302f, 21.5637f)
        curveTo(8.80017f, 22f, 9.60488f, 22f, 11.2143f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        horizontalLineTo(17.5f)
        moveTo(15f, 18f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 9f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 6f)
        horizontalLineTo(9f)
        curveTo(8.51194f, 6f, 8.26792f, 6f, 8.03739f, 6.02684f)
        curveTo(7.10692f, 6.13518f, 6.24399f, 6.56665f, 5.59904f, 7.24602f)
        curveTo(5.43925f, 7.41433f, 5.29283f, 7.60956f, 5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5.99954f)
        curveTo(16.0195f, 5.49103f, 17.5998f, 4.17647f, 18.3402f, 3.29011f)
        curveTo(18.8693f, 2.6567f, 19.5f, 2f, 21f, 2f)
        verticalLineTo(10f)
        curveTo(19.5f, 10f, 18.8693f, 9.34284f, 18.3402f, 8.70943f)
        curveTo(17.5998f, 7.82307f, 16.0195f, 6.50805f, 15f, 5.99954f)
        }
        }.build()

        return _breastPump!!
    }

private var _breastPump: ImageVector? = null
