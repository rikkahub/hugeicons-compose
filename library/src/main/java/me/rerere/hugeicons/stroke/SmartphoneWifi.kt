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

val HugeIcons.SmartphoneWifi: ImageVector
    get() {
        if (_smartphoneWifi != null) {
            return _smartphoneWifi!!
        }
        _smartphoneWifi = ImageVector.Builder(
            name = "SmartphoneWifi",
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
            moveTo(8f, 6f)
            curveTo(6.37274f, 6.02975f, 5.43781f, 6.1682f, 4.80546f, 6.81237f)
            curveTo(4f, 7.63289f, 4f, 8.9535f, 4f, 11.5947f)
            verticalLineTo(16.3971f)
            curveTo(4f, 19.0384f, 4f, 20.359f, 4.80546f, 21.1795f)
            curveTo(5.61091f, 22f, 6.90728f, 22f, 9.5f, 22f)
            curveTo(12.0927f, 22f, 13.3891f, 22f, 14.1945f, 21.1795f)
            curveTo(15f, 20.359f, 15f, 19.0384f, 15f, 16.3971f)
            verticalLineTo(13.4958f)
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
            moveTo(12.5f, 6.8647f)
            curveTo(13.2106f, 6.2981f, 14.0929f, 5.99038f, 15.0018f, 5.9922f)
            curveTo(15.9106f, 5.99401f, 16.7917f, 6.30527f, 17.5f, 6.8747f)
            moveTo(15f, 10f)
            horizontalLineTo(15.01f)
            moveTo(10f, 3.755f)
            curveTo(11.4189f, 2.61897f, 13.1824f, 2f, 15f, 2f)
            curveTo(16.8176f, 2f, 18.5811f, 2.61897f, 20f, 3.755f)
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
            moveTo(9f, 19f)
            horizontalLineTo(10f)
        }
        }.build()

        return _smartphoneWifi!!
    }

private var _smartphoneWifi: ImageVector? = null
