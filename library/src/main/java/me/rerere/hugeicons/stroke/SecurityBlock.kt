package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SecurityBlock: ImageVector
    get() {
        if (_securityBlock != null) {
            return _securityBlock!!
        }
        _securityBlock = ImageVector.Builder(
            name = "SecurityBlock",
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
        moveTo(19.8598f, 15.8599f)
        curveTo(20.5537f, 14.5522f, 21f, 13.0186f, 21f, 11.2371f)
        lineTo(21f, 7.74821f)
        curveTo(21f, 6.34255f, 21f, 5.63972f, 20.5504f, 4.91385f)
        curveTo(20.1008f, 4.18797f, 19.6368f, 3.95712f, 18.7088f, 3.4954f)
        curveTo(16.8165f, 2.55388f, 14.5009f, 2.00006f, 12f, 2.00006f)
        curveTo(10.1475f, 2.00006f, 8.3966f, 2.30394f, 6.84414f, 2.8442f)
        moveTo(4.1416f, 4.14166f)
        curveTo(3.8764f, 4.33979f, 3.6614f, 4.57189f, 3.4496f, 4.91385f)
        curveTo(3f, 5.63972f, 3f, 6.34254f, 3f, 7.7482f)
        verticalLineTo(11.2371f)
        curveTo(3f, 16.9205f, 7.54236f, 20.0804f, 10.173f, 21.4339f)
        curveTo(10.9067f, 21.8113f, 11.2735f, 22.0001f, 12f, 22.0001f)
        curveTo(12.7265f, 22.0001f, 13.0933f, 21.8113f, 13.8269f, 21.4339f)
        curveTo(15.0804f, 20.789f, 16.7679f, 19.734f, 18.1912f, 18.1913f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2.00006f)
        lineTo(22f, 22.0001f)
        }
        }.build()

        return _securityBlock!!
    }

private var _securityBlock: ImageVector? = null
