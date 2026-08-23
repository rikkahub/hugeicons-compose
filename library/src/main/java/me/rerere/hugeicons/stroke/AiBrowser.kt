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

val HugeIcons.AiBrowser: ImageVector
    get() {
        if (_aiBrowser != null) {
            return _aiBrowser!!
        }
        _aiBrowser = ImageVector.Builder(
            name = "AiBrowser",
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
            moveTo(18.4737f, 15.5215f)
            curveTo(18.4795f, 15.4928f, 18.5205f, 15.4928f, 18.5263f, 15.5215f)
            curveTo(18.8302f, 17.0081f, 19.9919f, 18.1698f, 21.4785f, 18.4737f)
            curveTo(21.5072f, 18.4795f, 21.5072f, 18.5205f, 21.4785f, 18.5263f)
            curveTo(19.9919f, 18.8302f, 18.8302f, 19.9919f, 18.5263f, 21.4785f)
            curveTo(18.5205f, 21.5072f, 18.4795f, 21.5072f, 18.4737f, 21.4785f)
            curveTo(18.1698f, 19.9919f, 17.0081f, 18.8302f, 15.5215f, 18.5263f)
            curveTo(15.4928f, 18.5205f, 15.4928f, 18.4795f, 15.5215f, 18.4737f)
            curveTo(17.0081f, 18.1698f, 18.1698f, 17.0081f, 18.4737f, 15.5215f)
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
            moveTo(12.5f, 20.5f)
            horizontalLineTo(10.5f)
            curveTo(6.72876f, 20.5f, 4.84315f, 20.5f, 3.67157f, 19.3284f)
            curveTo(2.5f, 18.1569f, 2.5f, 16.2712f, 2.5f, 12.5f)
            verticalLineTo(10.5f)
            curveTo(2.5f, 6.72876f, 2.5f, 4.84315f, 3.67157f, 3.67157f)
            curveTo(4.84315f, 2.5f, 6.72876f, 2.5f, 10.5f, 2.5f)
            horizontalLineTo(12.5f)
            curveTo(16.2712f, 2.5f, 18.1569f, 2.5f, 19.3284f, 3.67157f)
            curveTo(20.5f, 4.84315f, 20.5f, 6.72876f, 20.5f, 10.5f)
            verticalLineTo(12.5f)
        }
        }.build()

        return _aiBrowser!!
    }

private var _aiBrowser: ImageVector? = null
