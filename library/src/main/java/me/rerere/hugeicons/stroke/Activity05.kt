package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Activity05: ImageVector
    get() {
        if (_activity05 != null) {
            return _activity05!!
        }
        _activity05 = ImageVector.Builder(
            name = "Activity05",
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
        moveTo(10f, 4f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 4f, 19.6569f, 4f, 20.8284f, 5.17157f)
        curveTo(22f, 6.34315f, 22f, 8.22876f, 22f, 12f)
        curveTo(22f, 15.7712f, 22f, 17.6569f, 20.8284f, 18.8284f)
        curveTo(19.6569f, 20f, 17.7712f, 20f, 14f, 20f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 20f, 4.34315f, 20f, 3.17157f, 18.8284f)
        curveTo(2f, 17.6569f, 2f, 15.7712f, 2f, 12f)
        curveTo(2f, 8.22876f, 2f, 6.34315f, 3.17157f, 5.17157f)
        curveTo(4.34315f, 4f, 6.22876f, 4f, 10f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14f)
        horizontalLineTo(3.85765f)
        curveTo(5.3614f, 14f, 6.11328f, 14f, 6.75405f, 13.6684f)
        curveTo(6.79157f, 13.649f, 6.82868f, 13.6288f, 6.86536f, 13.6078f)
        curveTo(7.49186f, 13.249f, 7.90893f, 12.6122f, 8.74306f, 11.3386f)
        curveTo(10.181f, 9.1431f, 10.8999f, 8.04535f, 11.9159f, 8.0018f)
        curveTo(11.9719f, 7.9994f, 12.0281f, 7.9994f, 12.0841f, 8.0018f)
        curveTo(13.1001f, 8.04535f, 13.819f, 9.1431f, 15.2569f, 11.3386f)
        curveTo(16.0911f, 12.6122f, 16.5081f, 13.249f, 17.1346f, 13.6078f)
        curveTo(17.1713f, 13.6288f, 17.2084f, 13.649f, 17.2459f, 13.6684f)
        curveTo(17.8867f, 14f, 18.6386f, 14f, 20.1423f, 14f)
        horizontalLineTo(22f)
        }
        }.build()

        return _activity05!!
    }

private var _activity05: ImageVector? = null
