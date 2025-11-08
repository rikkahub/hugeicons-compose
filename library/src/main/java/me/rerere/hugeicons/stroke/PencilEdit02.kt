package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PencilEdit02: ImageVector
    get() {
        if (_pencilEdit02 != null) {
            return _pencilEdit02!!
        }
        _pencilEdit02 = ImageVector.Builder(
            name = "PencilEdit02",
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
        moveTo(16.4249f, 4.60509f)
        lineTo(17.4149f, 3.6151f)
        curveTo(18.2351f, 2.79497f, 19.5648f, 2.79497f, 20.3849f, 3.6151f)
        curveTo(21.205f, 4.43524f, 21.205f, 5.76493f, 20.3849f, 6.58507f)
        lineTo(19.3949f, 7.57506f)
        moveTo(16.4249f, 4.60509f)
        lineTo(9.76558f, 11.2644f)
        curveTo(9.25807f, 11.772f, 8.89804f, 12.4078f, 8.72397f, 13.1041f)
        lineTo(8f, 16f)
        lineTo(10.8959f, 15.276f)
        curveTo(11.5922f, 15.102f, 12.228f, 14.7419f, 12.7356f, 14.2344f)
        lineTo(19.3949f, 7.57506f)
        moveTo(16.4249f, 4.60509f)
        lineTo(19.3949f, 7.57506f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9999f, 13.5f)
        curveTo(18.9999f, 16.7875f, 18.9999f, 18.4312f, 18.092f, 19.5376f)
        curveTo(17.9258f, 19.7401f, 17.7401f, 19.9258f, 17.5375f, 20.092f)
        curveTo(16.4312f, 21f, 14.7874f, 21f, 11.4999f, 21f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 21f, 5.34316f, 21f, 4.17159f, 19.8284f)
        curveTo(3.00003f, 18.6569f, 3f, 16.7712f, 3f, 13f)
        verticalLineTo(12.5f)
        curveTo(3f, 9.21252f, 3f, 7.56879f, 3.90794f, 6.46244f)
        curveTo(4.07417f, 6.2599f, 4.2599f, 6.07417f, 4.46244f, 5.90794f)
        curveTo(5.56879f, 5f, 7.21252f, 5f, 10.5f, 5f)
        }
        }.build()

        return _pencilEdit02!!
    }

private var _pencilEdit02: ImageVector? = null
