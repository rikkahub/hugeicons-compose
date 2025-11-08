package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MobileNavigator02: ImageVector
    get() {
        if (_mobileNavigator02 != null) {
            return _mobileNavigator02!!
        }
        _mobileNavigator02 = ImageVector.Builder(
            name = "MobileNavigator02",
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
        moveTo(12f, 6.5f)
        curveTo(13.8941f, 6.5f, 15.5f, 8.11319f, 15.5f, 10.0703f)
        curveTo(15.5f, 12.0586f, 13.868f, 13.4539f, 12.3605f, 14.4027f)
        curveTo(12.2506f, 14.4665f, 12.1264f, 14.5f, 12f, 14.5f)
        curveTo(11.8736f, 14.5f, 11.7494f, 14.4665f, 11.6395f, 14.4027f)
        curveTo(10.1348f, 13.4446f, 8.5f, 12.0655f, 8.5f, 10.0703f)
        curveTo(8.5f, 8.11319f, 10.1059f, 6.5f, 12f, 6.5f)
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

        return _mobileNavigator02!!
    }

private var _mobileNavigator02: ImageVector? = null
