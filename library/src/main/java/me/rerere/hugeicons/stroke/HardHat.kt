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

val HugeIcons.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = ImageVector.Builder(
            name = "HardHat",
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
            moveTo(19.5f, 16f)
            horizontalLineTo(4.5f)
            curveTo(3.11929f, 16f, 2f, 17.1193f, 2f, 18.5f)
            curveTo(2f, 19.3284f, 2.67157f, 20f, 3.5f, 20f)
            horizontalLineTo(20.5f)
            curveTo(21.3284f, 20f, 22f, 19.3284f, 22f, 18.5f)
            curveTo(22f, 17.1193f, 20.8807f, 16f, 19.5f, 16f)
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
            moveTo(15.25f, 16f)
            lineTo(14.4369f, 6.24223f)
            curveTo(14.3689f, 5.42642f, 14.3349f, 5.01852f, 14.1471f, 4.71354f)
            curveTo(14.002f, 4.47782f, 13.7944f, 4.28687f, 13.5475f, 4.16181f)
            curveTo(13.228f, 4f, 12.8186f, 4f, 12f, 4f)
            curveTo(11.1814f, 4f, 10.772f, 4f, 10.4525f, 4.16181f)
            curveTo(10.2056f, 4.28687f, 9.99804f, 4.47782f, 9.85291f, 4.71354f)
            curveTo(9.66512f, 5.01852f, 9.63113f, 5.42642f, 9.56315f, 6.24223f)
            lineTo(8.75f, 16f)
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
            moveTo(15f, 6.0957f)
            curveTo(18.1368f, 6.69199f, 21f, 10.0038f, 21f, 14f)
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
            moveTo(9f, 6.0957f)
            curveTo(5.86324f, 6.69199f, 3f, 10.0038f, 3f, 14f)
            verticalLineTo(16.5f)
        }
        }.build()

        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
