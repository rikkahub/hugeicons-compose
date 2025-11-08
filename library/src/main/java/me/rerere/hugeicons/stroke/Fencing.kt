package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fencing: ImageVector
    get() {
        if (_fencing != null) {
            return _fencing!!
        }
        _fencing = ImageVector.Builder(
            name = "Fencing",
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
        moveTo(6.88673f, 15.6009f)
        lineTo(2.72303f, 18.5907f)
        curveTo(2.56872f, 18.7001f, 2.42869f, 18.8285f, 2.30621f, 18.9728f)
        curveTo(1.33417f, 20.1179f, 2.8868f, 21.6661f, 4.03001f, 20.6924f)
        curveTo(4.17151f, 20.5719f, 4.29775f, 20.4344f, 4.40576f, 20.283f)
        lineTo(7.38448f, 16.0995f)
        moveTo(9.01217f, 14.006f)
        curveTo(7.05577f, 12.0464f, 4.94319f, 13.6542f, 4.94319f, 13.6542f)
        curveTo(4.94319f, 13.6542f, 5.9327f, 14.6453f, 7.15333f, 15.868f)
        curveTo(8.37395f, 17.0906f, 9.31531f, 18.0335f, 9.31531f, 18.0335f)
        curveTo(9.31531f, 18.0335f, 10.9686f, 15.9657f, 9.01217f, 14.006f)
        moveTo(9.01217f, 14.006f)
        lineTo(20f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.1133f, 15.6009f)
        lineTo(21.277f, 18.5907f)
        curveTo(21.4313f, 18.7001f, 21.5713f, 18.8285f, 21.6938f, 18.9728f)
        curveTo(22.6658f, 20.1179f, 21.1132f, 21.666f, 19.97f, 20.6924f)
        curveTo(19.8285f, 20.5719f, 19.7023f, 20.4344f, 19.5942f, 20.283f)
        lineTo(16.6155f, 16.0995f)
        moveTo(14.9878f, 14.006f)
        curveTo(16.9442f, 12.0464f, 19.0568f, 13.6542f, 19.0568f, 13.6542f)
        curveTo(19.0568f, 13.6542f, 18.0673f, 14.6453f, 16.8467f, 15.868f)
        curveTo(15.626f, 17.0906f, 14.6847f, 18.0335f, 14.6847f, 18.0335f)
        curveTo(14.6847f, 18.0335f, 13.0314f, 15.9657f, 14.9878f, 14.006f)
        moveTo(14.9878f, 14.006f)
        lineTo(4f, 3f)
        }
        }.build()

        return _fencing!!
    }

private var _fencing: ImageVector? = null
