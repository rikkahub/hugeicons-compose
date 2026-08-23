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

val HugeIcons.MousePointer: ImageVector
    get() {
        if (_mousePointer != null) {
            return _mousePointer!!
        }
        _mousePointer = ImageVector.Builder(
            name = "MousePointer",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.493f, 8.22584f)
            lineTo(7.3576f, 16.157f)
            curveTo(7.85185f, 17.5255f, 8.09898f, 18.2097f, 8.45163f, 18.4775f)
            curveTo(8.93592f, 18.8454f, 9.59296f, 18.8809f, 10.1135f, 18.5674f)
            curveTo(10.4925f, 18.339f, 10.8108f, 17.6854f, 11.4474f, 16.3781f)
            curveTo(11.5819f, 16.1019f, 11.6491f, 15.9638f, 11.7432f, 15.892f)
            curveTo(11.8724f, 15.7934f, 12.0411f, 15.7644f, 12.1953f, 15.8144f)
            curveTo(12.3077f, 15.8509f, 12.4165f, 15.9588f, 12.634f, 16.1747f)
            lineTo(15.868f, 19.3847f)
            curveTo(16.5124f, 20.0242f, 16.8345f, 20.344f, 17.2109f, 20.4472f)
            curveTo(17.4673f, 20.5176f, 17.7377f, 20.5176f, 17.994f, 20.4472f)
            curveTo(18.3704f, 20.344f, 18.6926f, 20.0242f, 19.3369f, 19.3847f)
            curveTo(19.9997f, 18.7268f, 20.3311f, 18.3979f, 20.4377f, 18.011f)
            curveTo(20.5103f, 17.7477f, 20.5103f, 17.4694f, 20.4377f, 17.2061f)
            curveTo(20.3311f, 16.8192f, 19.9997f, 16.4903f, 19.3369f, 15.8325f)
            lineTo(16.3056f, 12.8237f)
            curveTo(15.9966f, 12.517f, 15.8422f, 12.3637f, 15.8204f, 12.1917f)
            curveTo(15.8092f, 12.1033f, 15.8217f, 12.0134f, 15.8564f, 11.9314f)
            curveTo(15.924f, 11.772f, 16.1142f, 11.6671f, 16.4945f, 11.4574f)
            curveTo(18.3667f, 10.4251f, 19.3028f, 9.90888f, 19.4553f, 9.25667f)
            curveTo(19.5323f, 8.92777f, 19.497f, 8.58233f, 19.3552f, 8.27612f)
            curveTo(19.0742f, 7.6689f, 18.0534f, 7.35574f, 16.0119f, 6.72943f)
            lineTo(8.16285f, 4.32144f)
            curveTo(5.67046f, 3.55681f, 4.42426f, 3.17449f, 3.79009f, 3.84919f)
            curveTo(3.15592f, 4.52388f, 3.60162f, 5.75787f, 4.493f, 8.22584f)
            close()
        }
        }.build()

        return _mousePointer!!
    }

private var _mousePointer: ImageVector? = null
