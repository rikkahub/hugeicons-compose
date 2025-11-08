package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Restaurant01: ImageVector
    get() {
        if (_restaurant01 != null) {
            return _restaurant01!!
        }
        _restaurant01 = ImageVector.Builder(
            name = "Restaurant01",
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
        moveTo(15f, 10f)
        lineTo(4f, 21.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9999f, 3.00098f)
        lineTo(14.9999f, 6.00098f)
        curveTo(14.4547f, 6.54623f, 14.1821f, 6.81885f, 14.0363f, 7.11295f)
        curveTo(13.759f, 7.6725f, 13.759f, 8.32945f, 14.0363f, 8.88901f)
        curveTo(14.1821f, 9.1831f, 14.4547f, 9.45573f, 14.9999f, 10.001f)
        curveTo(15.5452f, 10.5462f, 15.8178f, 10.8189f, 16.1119f, 10.9646f)
        curveTo(16.6715f, 11.2419f, 17.3284f, 11.2419f, 17.888f, 10.9646f)
        curveTo(18.1821f, 10.8189f, 18.4547f, 10.5462f, 18.9999f, 10.001f)
        lineTo(21.9999f, 7.00098f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 4.99902f)
        lineTo(17f, 7.99902f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.84473f, 9.84571f)
        curveTo(7.47968f, 11.2108f, 5.60771f, 11.552f, 3.90145f, 9.84571f)
        curveTo(2.19514f, 8.13939f, 1.30058f, 5.03166f, 2.66563f, 3.66661f)
        curveTo(4.03069f, 2.30156f, 7.13841f, 3.19611f, 8.84473f, 4.90243f)
        curveTo(10.551f, 6.60868f, 10.2098f, 8.48065f, 8.84473f, 9.84571f)
        moveTo(8.84473f, 9.84571f)
        lineTo(20f, 21.001f)
        }
        }.build()

        return _restaurant01!!
    }

private var _restaurant01: ImageVector? = null
