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

val HugeIcons.LassoSelect: ImageVector
    get() {
        if (_lassoSelect != null) {
            return _lassoSelect!!
        }
        _lassoSelect = ImageVector.Builder(
            name = "LassoSelect",
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
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.4014f, 12.8149f)
            lineTo(19.4182f, 13.9953f)
            curveTo(21.1582f, 14.6762f, 22.0282f, 15.0166f, 21.9993f, 15.5567f)
            curveTo(21.9705f, 16.0967f, 21.0625f, 16.3443f, 19.2466f, 16.8395f)
            lineTo(19.2466f, 16.8395f)
            curveTo(18.7059f, 16.987f, 18.4356f, 17.0607f, 18.2482f, 17.2482f)
            curveTo(18.0607f, 17.4356f, 17.987f, 17.7059f, 17.8395f, 18.2466f)
            lineTo(17.8395f, 18.2466f)
            curveTo(17.3443f, 20.0625f, 17.0967f, 20.9705f, 16.5567f, 20.9993f)
            curveTo(16.0166f, 21.0282f, 15.6762f, 20.1582f, 14.9953f, 18.4182f)
            lineTo(13.8149f, 15.4014f)
            curveTo(13.102f, 13.5797f, 12.7456f, 12.6688f, 13.2072f, 12.2072f)
            curveTo(13.6688f, 11.7456f, 14.5797f, 12.102f, 16.4014f, 12.8149f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 17f)
            curveTo(3.89543f, 17f, 3f, 16.1046f, 3f, 15f)
            curveTo(3f, 13.8954f, 3.89543f, 13f, 5f, 13f)
            curveTo(6.10457f, 13f, 7f, 13.8954f, 7f, 15f)
            curveTo(7f, 16.1046f, 6.10457f, 17f, 5f, 17f)
            close()
            moveTo(5f, 17f)
            curveTo(5f, 18.6f, 6.33333f, 19.6667f, 7f, 20f)
            moveTo(21.8987f, 11f)
            curveTo(21.9655f, 10.6734f, 22f, 10.3395f, 22f, 10f)
            curveTo(22f, 6.13401f, 17.5228f, 3f, 12f, 3f)
            curveTo(6.47715f, 3f, 2f, 6.13401f, 2f, 10f)
            curveTo(2f, 11.3199f, 2.52185f, 12.5544f, 3.42901f, 13.6081f)
            moveTo(6.84631f, 16f)
            curveTo(7.80456f, 16.4042f, 8.86753f, 16.6991f, 10f, 16.86f)
        }
        }.build()

        return _lassoSelect!!
    }

private var _lassoSelect: ImageVector? = null
