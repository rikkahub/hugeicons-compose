package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HotTube: ImageVector
    get() {
        if (_hotTube != null) {
            return _hotTube!!
        }
        _hotTube = ImageVector.Builder(
            name = "HotTube",
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
        moveTo(3.6644f, 16.9864f)
        lineTo(3f, 13f)
        horizontalLineTo(21f)
        lineTo(20.3356f, 16.9864f)
        curveTo(19.9365f, 19.3809f, 19.737f, 20.5781f, 18.8977f, 21.2891f)
        curveTo(18.0585f, 22f, 16.8448f, 22f, 14.4172f, 22f)
        horizontalLineTo(9.58276f)
        curveTo(7.15525f, 22f, 5.94149f, 22f, 5.10226f, 21.2891f)
        curveTo(4.26302f, 20.5781f, 4.06348f, 19.3809f, 3.6644f, 16.9864f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.6f, 10f)
        curveTo(19.1333f, 9.44772f, 19.1333f, 8.55228f, 18.6f, 8f)
        curveTo(18.0667f, 7.44772f, 18.0667f, 6.55228f, 18.6f, 6f)
        moveTo(15.4f, 10f)
        curveTo(15.9333f, 9.44772f, 15.9333f, 8.55228f, 15.4f, 8f)
        curveTo(14.8667f, 7.44772f, 14.8667f, 6.55228f, 15.4f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 13f)
        horizontalLineTo(2f)
        moveTo(21f, 13f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 13f)
        verticalLineTo(9.8513f)
        curveTo(5f, 8.82886f, 5.82885f, 8f, 6.8513f, 8f)
        curveTo(8.18f, 8f, 9.40683f, 8.71196f, 10.0661f, 9.8656f)
        lineTo(13f, 15f)
        moveTo(9f, 4f)
        curveTo(9f, 5.10457f, 8.10457f, 6f, 7f, 6f)
        curveTo(5.89543f, 6f, 5f, 5.10457f, 5f, 4f)
        curveTo(5f, 2.89543f, 5.89543f, 2f, 7f, 2f)
        curveTo(8.10457f, 2f, 9f, 2.89543f, 9f, 4f)
        }
        }.build()

        return _hotTube!!
    }

private var _hotTube: ImageVector? = null
