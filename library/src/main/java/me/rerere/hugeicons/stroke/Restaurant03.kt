package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Restaurant03: ImageVector
    get() {
        if (_restaurant03 != null) {
            return _restaurant03!!
        }
        _restaurant03 = ImageVector.Builder(
            name = "Restaurant03",
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
        moveTo(4f, 21.001f)
        lineTo(7.00071f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10.001f)
        lineTo(14f, 11.001f)
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
        moveTo(20f, 5f)
        lineTo(17f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 21f)
        lineTo(12f, 13f)
        moveTo(12f, 13f)
        lineTo(2f, 3f)
        curveTo(2f, 6.84174f, 3.52612f, 10.5261f, 6.24264f, 13.2426f)
        lineTo(9f, 16f)
        lineTo(12f, 13f)
        }
        }.build()

        return _restaurant03!!
    }

private var _restaurant03: ImageVector? = null
