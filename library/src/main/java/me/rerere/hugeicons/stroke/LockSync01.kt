package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LockSync01: ImageVector
    get() {
        if (_lockSync01 != null) {
            return _lockSync01!!
        }
        _lockSync01 = ImageVector.Builder(
            name = "LockSync01",
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
        moveTo(19.5433f, 10.5f)
        lineTo(22f, 11f)
        curveTo(21.497f, 5.94668f, 17.2229f, 2f, 12.0247f, 2f)
        curveTo(6.48823f, 2f, 1.99999f, 6.47715f, 1.99999f, 12f)
        curveTo(1.99999f, 17.5228f, 6.48823f, 22f, 12.0247f, 22f)
        curveTo(16.1355f, 22f, 19.6684f, 19.5318f, 21.2153f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.3371f, 10.88f)
        curveTo(9.25713f, 10.88f, 8.71713f, 11.66f, 8.59713f, 12.14f)
        curveTo(8.47713f, 12.62f, 8.47713f, 14.36f, 8.54913f, 15.08f)
        curveTo(8.78913f, 15.98f, 9.38913f, 16.352f, 9.97713f, 16.472f)
        curveTo(10.5171f, 16.52f, 12.7971f, 16.502f, 13.4571f, 16.502f)
        curveTo(14.4171f, 16.52f, 15.1371f, 16.16f, 15.4371f, 15.08f)
        curveTo(15.4971f, 14.72f, 15.5571f, 12.74f, 15.4071f, 12.14f)
        curveTo(15.0891f, 11.18f, 14.2971f, 10.88f, 13.6971f, 10.88f)
        horizontalLineTo(10.3371f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.25f, 10.4585f)
        curveTo(10.25f, 10.3985f, 10.2582f, 10.0531f, 10.2596f, 9.61854f)
        curveTo(10.2609f, 9.22145f, 10.226f, 8.83854f, 10.4156f, 8.48814f)
        curveTo(11.126f, 7.07454f, 13.166f, 7.21854f, 13.67f, 8.65854f)
        curveTo(13.7573f, 8.89562f, 13.7626f, 9.27146f, 13.76f, 9.61854f)
        curveTo(13.7567f, 10.062f, 13.766f, 10.4585f, 13.766f, 10.4585f)
        }
        }.build()

        return _lockSync01!!
    }

private var _lockSync01: ImageVector? = null
