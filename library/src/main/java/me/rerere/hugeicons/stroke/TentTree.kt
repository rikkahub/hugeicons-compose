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

val HugeIcons.TentTree: ImageVector
    get() {
        if (_tentTree != null) {
            return _tentTree!!
        }
        _tentTree = ImageVector.Builder(
            name = "TentTree",
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
            moveTo(6.99998f, 5f)
            arcTo(2f, 2f, 0f, true, false, 2.99998f, 5f)
            arcTo(2f, 2f, 0f, true, false, 6.99998f, 5f)
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
            moveTo(3.11947f, 18.9046f)
            lineTo(7.27295f, 12.4381f)
            curveTo(7.41879f, 12.1679f, 7.6974f, 12f, 8.00002f, 12f)
            curveTo(8.30263f, 12f, 8.58124f, 12.1679f, 8.72708f, 12.4381f)
            lineTo(12.8806f, 18.9046f)
            curveTo(13.7569f, 20.269f, 14.195f, 20.9511f, 13.9168f, 21.4756f)
            curveTo(13.6386f, 22f, 12.8386f, 22f, 11.2386f, 22f)
            horizontalLineTo(4.76146f)
            curveTo(3.16142f, 22f, 2.3614f, 22f, 2.08321f, 21.4756f)
            curveTo(1.80501f, 20.9511f, 2.24316f, 20.269f, 3.11947f, 18.9046f)
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
            moveTo(7.99998f, 12f)
            verticalLineTo(22f)
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
            moveTo(9.98276f, 22f)
            horizontalLineTo(19.2172f)
            curveTo(20.8283f, 22f, 21.6339f, 22f, 21.9153f, 21.477f)
            curveTo(22.1967f, 20.954f, 21.7577f, 20.2726f, 20.8796f, 18.91f)
            lineTo(17.0132f, 12.91f)
            curveTo(16.7263f, 12.4648f, 16.5828f, 12.2422f, 16.3616f, 12.1211f)
            curveTo(16.1404f, 12f, 15.8772f, 12f, 15.3508f, 12f)
            horizontalLineTo(7.99998f)
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
            moveTo(21f, 5f)
            curveTo(20.3333f, 4.66667f, 18.8f, 3.6f, 18f, 2f)
            curveTo(17.2f, 3.6f, 15.6667f, 4.66667f, 15f, 5f)
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
            moveTo(21f, 9f)
            curveTo(20.3333f, 8.66667f, 18.8f, 7.6f, 18f, 6f)
            curveTo(17.2f, 7.6f, 15.6667f, 8.66667f, 15f, 9f)
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
            moveTo(18f, 2f)
            verticalLineTo(14f)
        }
        }.build()

        return _tentTree!!
    }

private var _tentTree: ImageVector? = null
