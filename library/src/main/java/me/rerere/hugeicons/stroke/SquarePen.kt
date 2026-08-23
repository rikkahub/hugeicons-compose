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

val HugeIcons.SquarePen: ImageVector
    get() {
        if (_squarePen != null) {
            return _squarePen!!
        }
        _squarePen = ImageVector.Builder(
            name = "SquarePen",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.99219f, 16f)
            lineTo(8.71615f, 13.1041f)
            curveTo(8.89023f, 12.4078f, 9.25026f, 11.772f, 9.75776f, 11.2644f)
            lineTo(16.4171f, 4.60509f)
            lineTo(17.4071f, 3.6151f)
            curveTo(18.2272f, 2.79497f, 19.557f, 2.79497f, 20.3771f, 3.6151f)
            curveTo(21.1972f, 4.43524f, 21.1972f, 5.76493f, 20.3771f, 6.58507f)
            lineTo(19.3871f, 7.57506f)
            lineTo(12.7277f, 14.2344f)
            curveTo(12.2202f, 14.7419f, 11.5843f, 15.102f, 10.888f, 15.276f)
            lineTo(7.99219f, 16f)
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
            moveTo(18.9921f, 13.5f)
            curveTo(18.9921f, 16.7875f, 18.9921f, 18.4312f, 18.0842f, 19.5376f)
            curveTo(17.918f, 19.7401f, 17.7322f, 19.9258f, 17.5297f, 20.092f)
            curveTo(16.4234f, 21f, 14.7796f, 21f, 11.4921f, 21f)
            horizontalLineTo(10.9922f)
            curveTo(7.22095f, 21f, 5.33535f, 21f, 4.16378f, 19.8284f)
            curveTo(2.99222f, 18.6569f, 2.99219f, 16.7712f, 2.99219f, 13f)
            verticalLineTo(12.5f)
            curveTo(2.99219f, 9.21252f, 2.99219f, 7.56879f, 3.90013f, 6.46244f)
            curveTo(4.06636f, 6.2599f, 4.25208f, 6.07417f, 4.45463f, 5.90794f)
            curveTo(5.56098f, 5f, 7.20471f, 5f, 10.4922f, 5f)
        }
        }.build()

        return _squarePen!!
    }

private var _squarePen: ImageVector? = null
