package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Door01: ImageVector
    get() {
        if (_door01 != null) {
            return _door01!!
        }
        _door01 = ImageVector.Builder(
            name = "Door01",
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
        moveTo(18f, 20f)
        curveTo(19.1046f, 20f, 20f, 19.1046f, 20f, 18f)
        verticalLineTo(6f)
        curveTo(20f, 4.89543f, 19.1046f, 4f, 18f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 6.84771f)
        verticalLineTo(17.1523f)
        curveTo(4f, 18.7454f, 4f, 19.542f, 4.4645f, 20.0976f)
        curveTo(4.92899f, 20.6531f, 5.71415f, 20.7956f, 7.28446f, 21.0806f)
        lineTo(10.2845f, 21.6251f)
        curveTo(12.4701f, 22.0217f, 13.563f, 22.2201f, 14.2815f, 21.6215f)
        curveTo(15f, 21.023f, 15f, 19.9142f, 15f, 17.6968f)
        verticalLineTo(6.30325f)
        curveTo(15f, 4.08578f, 15f, 2.97704f, 14.2815f, 2.37849f)
        curveTo(13.563f, 1.77994f, 12.4701f, 1.97827f, 10.2845f, 2.37495f)
        lineTo(7.28446f, 2.91941f)
        curveTo(5.71415f, 3.2044f, 4.92899f, 3.34689f, 4.4645f, 3.90244f)
        curveTo(4f, 4.45799f, 4f, 5.25457f, 4f, 6.84771f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 11.9983f)
        lineTo(11.5f, 11.9883f)
        }
        }.build()

        return _door01!!
    }

private var _door01: ImageVector? = null
