package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Paragliding: ImageVector
    get() {
        if (_paragliding != null) {
            return _paragliding!!
        }
        _paragliding = ImageVector.Builder(
            name = "Paragliding",
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
        moveTo(12.7586f, 11.213f)
        curveTo(12.2725f, 11.0137f, 11.7275f, 11.0137f, 11.2413f, 11.213f)
        lineTo(2.00402f, 15f)
        curveTo(2.00402f, 14.0305f, 1.92087f, 13.0354f, 2.51085f, 12.1986f)
        curveTo(4.55645f, 9.29747f, 8.40267f, 5.19677f, 11.0772f, 3.29756f)
        curveTo(11.636f, 2.90081f, 12.364f, 2.90081f, 12.9228f, 3.29756f)
        curveTo(15.5973f, 5.19677f, 19.4436f, 9.29747f, 21.4892f, 12.1986f)
        curveTo(22.0791f, 13.0354f, 21.996f, 14.0305f, 21.996f, 15f)
        lineTo(12.7586f, 11.213f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.028f, 12f)
        curveTo(9.60981f, 13.1195f, 7.27437f, 17.1832f, 8.22598f, 18.2889f)
        curveTo(8.94881f, 19.1288f, 14.8699f, 19.3394f, 15.774f, 18.2889f)
        curveTo(16.7256f, 17.1832f, 14.3902f, 13.1195f, 13.972f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        lineTo(4.5f, 14f)
        moveTo(16f, 17f)
        lineTo(19.5f, 14f)
        }
        }.build()

        return _paragliding!!
    }

private var _paragliding: ImageVector? = null
