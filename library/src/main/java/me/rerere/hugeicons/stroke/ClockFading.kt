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

val HugeIcons.ClockFading: ImageVector
    get() {
        if (_clockFading != null) {
            return _clockFading!!
        }
        _clockFading = ImageVector.Builder(
            name = "ClockFading",
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
            moveTo(5.43823f, 19.5496f)
            curveTo(6.54888f, 20.5162f, 7.89133f, 21.2512f, 9.40963f, 21.6576f)
            curveTo(10.2751f, 21.8893f, 11.1446f, 22f, 12f, 22f)
            moveTo(16.5374f, 20.906f)
            curveTo(17.6966f, 20.3145f, 18.7389f, 19.4992f, 19.5953f, 18.5f)
            moveTo(21.6561f, 14.5847f)
            curveTo(21.9352f, 13.5441f, 22.0395f, 12.4978f, 21.9868f, 11.4771f)
            moveTo(20.9103f, 7.46053f)
            curveTo(20.699f, 7.04586f, 20.4591f, 6.64615f, 20.1924f, 6.26456f)
            moveTo(16.4698f, 3.05251f)
            curveTo(15.8798f, 2.7588f, 15.2517f, 2.51942f, 14.5904f, 2.34238f)
            curveTo(9.25745f, 0.914877f, 3.77452f, 4.08152f, 2.3439f, 9.41528f)
            curveTo(1.78336f, 11.5051f, 1.92809f, 13.6176f, 2.63227f, 15.5f)
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
            moveTo(12f, 6f)
            verticalLineTo(12f)
            lineTo(16f, 14f)
        }
        }.build()

        return _clockFading!!
    }

private var _clockFading: ImageVector? = null
