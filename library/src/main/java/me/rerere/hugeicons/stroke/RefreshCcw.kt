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

val HugeIcons.RefreshCcw: ImageVector
    get() {
        if (_refreshCcw != null) {
            return _refreshCcw!!
        }
        _refreshCcw = ImageVector.Builder(
            name = "RefreshCcw",
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
            moveTo(20.9373f, 13f)
            curveTo(20.9736f, 12.6717f, 20.9922f, 12.338f, 20.9922f, 12f)
            curveTo(20.9922f, 7.02944f, 16.9628f, 3f, 11.9922f, 3f)
            curveTo(9.16492f, 3f, 6.64214f, 4.30367f, 4.99219f, 6.34267f)
            moveTo(3.04712f, 11f)
            curveTo(3.01082f, 11.3283f, 2.99219f, 11.662f, 2.99219f, 12f)
            curveTo(2.99219f, 16.9706f, 7.02162f, 21f, 11.9922f, 21f)
            curveTo(14.8195f, 21f, 17.3422f, 19.6963f, 18.9922f, 17.6573f)
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
            moveTo(7.99219f, 7f)
            horizontalLineTo(6.99219f)
            curveTo(5.57797f, 7f, 4.87087f, 7f, 4.43153f, 6.56066f)
            curveTo(3.99219f, 6.12132f, 3.99219f, 5.41421f, 3.99219f, 4f)
            verticalLineTo(3f)
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
            moveTo(15.9922f, 17f)
            horizontalLineTo(16.9922f)
            curveTo(18.4064f, 17f, 19.1135f, 17f, 19.5528f, 17.4393f)
            curveTo(19.9922f, 17.8787f, 19.9922f, 18.5858f, 19.9922f, 20f)
            verticalLineTo(21f)
        }
        }.build()

        return _refreshCcw!!
    }

private var _refreshCcw: ImageVector? = null
