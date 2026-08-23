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

val HugeIcons.WebSecurity: ImageVector
    get() {
        if (_webSecurity != null) {
            return _webSecurity!!
        }
        _webSecurity = ImageVector.Builder(
            name = "WebSecurity",
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
            moveTo(3f, 7.5f)
            horizontalLineTo(20f)
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
            moveTo(10.5f, 20.5f)
            curveTo(6.72876f, 20.5f, 4.84315f, 20.5f, 3.67157f, 19.3284f)
            curveTo(2.5f, 18.1569f, 2.5f, 16.2712f, 2.5f, 12.5f)
            verticalLineTo(10.5f)
            curveTo(2.5f, 6.72876f, 2.5f, 4.84315f, 3.67157f, 3.67157f)
            curveTo(4.84315f, 2.5f, 6.72876f, 2.5f, 10.5f, 2.5f)
            horizontalLineTo(12.5f)
            curveTo(16.2712f, 2.5f, 18.1569f, 2.5f, 19.3284f, 3.67157f)
            curveTo(20.5f, 4.84315f, 20.5f, 6.72876f, 20.5f, 10.5f)
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
            moveTo(15.5f, 16.5f)
            verticalLineTo(14.5f)
            curveTo(15.5f, 13.3954f, 16.3954f, 12.5f, 17.5f, 12.5f)
            curveTo(18.6046f, 12.5f, 19.5f, 13.3954f, 19.5f, 14.5f)
            verticalLineTo(16.5f)
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
            moveTo(19f, 16.5f)
            horizontalLineTo(16f)
            curveTo(15.0654f, 16.5f, 14.5981f, 16.5f, 14.25f, 16.701f)
            curveTo(14.022f, 16.8326f, 13.8326f, 17.022f, 13.701f, 17.25f)
            curveTo(13.5f, 17.5981f, 13.5f, 18.0654f, 13.5f, 19f)
            curveTo(13.5f, 19.9346f, 13.5f, 20.4019f, 13.701f, 20.75f)
            curveTo(13.8326f, 20.978f, 14.022f, 21.1674f, 14.25f, 21.299f)
            curveTo(14.5981f, 21.5f, 15.0654f, 21.5f, 16f, 21.5f)
            horizontalLineTo(19f)
            curveTo(19.9346f, 21.5f, 20.4019f, 21.5f, 20.75f, 21.299f)
            curveTo(20.978f, 21.1674f, 21.1674f, 20.978f, 21.299f, 20.75f)
            curveTo(21.5f, 20.4019f, 21.5f, 19.9346f, 21.5f, 19f)
            curveTo(21.5f, 18.0654f, 21.5f, 17.5981f, 21.299f, 17.25f)
            curveTo(21.1674f, 17.022f, 20.978f, 16.8326f, 20.75f, 16.701f)
            curveTo(20.4019f, 16.5f, 19.9346f, 16.5f, 19f, 16.5f)
            close()
        }
        }.build()

        return _webSecurity!!
    }

private var _webSecurity: ImageVector? = null
