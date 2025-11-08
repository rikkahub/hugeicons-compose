package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Champion: ImageVector
    get() {
        if (_champion != null) {
            return _champion!!
        }
        _champion = ImageVector.Builder(
            name = "Champion",
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
        moveTo(12f, 17f)
        curveTo(10.3264f, 17f, 8.86971f, 18.265f, 8.11766f, 20.1312f)
        curveTo(7.75846f, 21.0225f, 8.27389f, 22f, 8.95877f, 22f)
        horizontalLineTo(15.0412f)
        curveTo(15.7261f, 22f, 16.2415f, 21.0225f, 15.8823f, 20.1312f)
        curveTo(15.1303f, 18.265f, 13.6736f, 17f, 12f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 5f)
        horizontalLineTo(19.7022f)
        curveTo(20.9031f, 5f, 21.5035f, 5f, 21.8168f, 5.37736f)
        curveTo(22.13f, 5.75472f, 21.9998f, 6.32113f, 21.7393f, 7.45395f)
        lineTo(21.3485f, 9.15307f)
        curveTo(20.7609f, 11.7086f, 18.6109f, 13.6088f, 16f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 5f)
        horizontalLineTo(4.29779f)
        curveTo(3.09692f, 5f, 2.49649f, 5f, 2.18324f, 5.37736f)
        curveTo(1.86999f, 5.75472f, 2.00024f, 6.32113f, 2.26075f, 7.45395f)
        lineTo(2.65148f, 9.15307f)
        curveTo(3.23914f, 11.7086f, 5.38912f, 13.6088f, 8f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        curveTo(15.0208f, 17f, 17.565f, 12.3379f, 18.3297f, 5.99089f)
        curveTo(18.5412f, 4.23558f, 18.647f, 3.35793f, 18.0868f, 2.67896f)
        curveTo(17.5267f, 2f, 16.6223f, 2f, 14.8134f, 2f)
        horizontalLineTo(9.18658f)
        curveTo(7.37775f, 2f, 6.47333f, 2f, 5.91317f, 2.67896f)
        curveTo(5.35301f, 3.35793f, 5.45875f, 4.23558f, 5.67025f, 5.99089f)
        curveTo(6.435f, 12.3379f, 8.97923f, 17f, 12f, 17f)
        }
        }.build()

        return _champion!!
    }

private var _champion: ImageVector? = null
