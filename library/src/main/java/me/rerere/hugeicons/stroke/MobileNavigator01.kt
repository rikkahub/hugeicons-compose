package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MobileNavigator01: ImageVector
    get() {
        if (_mobileNavigator01 != null) {
            return _mobileNavigator01!!
        }
        _mobileNavigator01 = ImageVector.Builder(
            name = "MobileNavigator01",
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
        moveTo(4f, 9f)
        curveTo(4f, 5.70017f, 4f, 4.05025f, 5.17157f, 3.02513f)
        curveTo(6.34315f, 2f, 8.22876f, 2f, 12f, 2f)
        curveTo(15.7712f, 2f, 17.6569f, 2f, 18.8284f, 3.02513f)
        curveTo(20f, 4.05025f, 20f, 5.70017f, 20f, 9f)
        verticalLineTo(15f)
        curveTo(20f, 18.2998f, 20f, 19.9497f, 18.8284f, 20.9749f)
        curveTo(17.6569f, 22f, 15.7712f, 22f, 12f, 22f)
        curveTo(8.22876f, 22f, 6.34315f, 22f, 5.17157f, 20.9749f)
        curveTo(4f, 19.9497f, 4f, 18.2998f, 4f, 15f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6287f, 14.2468f)
        curveTo(12.4601f, 14.4092f, 12.2347f, 14.5f, 12.0001f, 14.5f)
        curveTo(11.7655f, 14.5f, 11.5401f, 14.4092f, 11.3715f, 14.2468f)
        curveTo(9.82715f, 12.7504f, 7.75759f, 11.0788f, 8.76685f, 8.65187f)
        curveTo(9.31255f, 7.33966f, 10.6225f, 6.5f, 12.0001f, 6.5f)
        curveTo(13.3777f, 6.5f, 14.6876f, 7.33966f, 15.2333f, 8.65187f)
        curveTo(16.2413f, 11.0757f, 14.1768f, 12.7555f, 12.6287f, 14.2468f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        horizontalLineTo(12.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 19f)
        horizontalLineTo(13f)
        }
        }.build()

        return _mobileNavigator01!!
    }

private var _mobileNavigator01: ImageVector? = null
