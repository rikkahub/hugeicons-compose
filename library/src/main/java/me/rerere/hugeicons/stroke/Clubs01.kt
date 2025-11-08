package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clubs01: ImageVector
    get() {
        if (_clubs01 != null) {
            return _clubs01!!
        }
        _clubs01 = ImageVector.Builder(
            name = "Clubs01",
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
        moveTo(14f, 13f)
        lineTo(12f, 10f)
        lineTo(10f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 5.5f)
        curveTo(14.5f, 8f, 12f, 10f, 12f, 10f)
        curveTo(12f, 10f, 9.5f, 8f, 9.5f, 5.5f)
        curveTo(9.5f, 3f, 10.6193f, 2f, 12f, 2f)
        curveTo(13.3807f, 2f, 14.5f, 3f, 14.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 15.5f)
        curveTo(16f, 15.5f, 14f, 13f, 14f, 13f)
        curveTo(14f, 13f, 16f, 10.5f, 18.5f, 10.5f)
        curveTo(21f, 10.5f, 22f, 11.6193f, 22f, 13f)
        curveTo(22f, 14.3807f, 21f, 15.5f, 18.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 15.5f)
        curveTo(8f, 15.5f, 10f, 13f, 10f, 13f)
        curveTo(10f, 13f, 8f, 10.5f, 5.5f, 10.5f)
        curveTo(3f, 10.5f, 2f, 11.6193f, 2f, 13f)
        curveTo(2f, 14.3807f, 3f, 15.5f, 5.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 22f)
        curveTo(16f, 22f, 13f, 16f, 10f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        curveTo(8f, 22f, 11f, 16f, 14f, 13f)
        }
        }.build()

        return _clubs01!!
    }

private var _clubs01: ImageVector? = null
