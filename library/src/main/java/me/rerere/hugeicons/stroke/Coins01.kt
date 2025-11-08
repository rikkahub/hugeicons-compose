package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coins01: ImageVector
    get() {
        if (_coins01 != null) {
            return _coins01!!
        }
        _coins01 = ImageVector.Builder(
            name = "Coins01",
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
        moveTo(22f, 15.5f)
        curveTo(22f, 16.6046f, 19.0899f, 17.5f, 15.5f, 17.5f)
        curveTo(11.9101f, 17.5f, 9f, 16.6046f, 9f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 11f)
        verticalLineTo(19.8f)
        curveTo(22f, 21.015f, 19.0899f, 22f, 15.5f, 22f)
        curveTo(11.9101f, 22f, 9f, 21.015f, 9f, 19.8f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 11f)
        curveTo(4.10819f, 10.7698f, 2.36991f, 10.1745f, 2f, 9f)
        moveTo(6f, 16f)
        curveTo(4.10819f, 15.7698f, 2.36991f, 15.1745f, 2f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21f)
        curveTo(4.10819f, 20.7698f, 2.36991f, 20.1745f, 2f, 19f)
        lineTo(2f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 6f)
        verticalLineTo(4f)
        }
        }.build()

        return _coins01!!
    }

private var _coins01: ImageVector? = null
