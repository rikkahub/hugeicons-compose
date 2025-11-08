package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BlackHole01: ImageVector
    get() {
        if (_blackHole01 != null) {
            return _blackHole01!!
        }
        _blackHole01 = ImageVector.Builder(
            name = "BlackHole01",
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
        moveTo(18.6017f, 12f)
        curveTo(17.6407f, 13.1652f, 15.0478f, 14f, 12f, 14f)
        curveTo(8.95216f, 14f, 6.35927f, 13.1652f, 5.39832f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.063f, 13.5f)
        curveTo(10.0219f, 13.3402f, 10f, 13.1726f, 10f, 13f)
        curveTo(10f, 11.8954f, 10.8954f, 11f, 12f, 11f)
        curveTo(13.1046f, 11f, 14f, 11.8954f, 14f, 13f)
        curveTo(14f, 13.1726f, 13.9781f, 13.3402f, 13.937f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 4f)
        lineTo(9f, 13.5f)
        moveTo(7f, 20f)
        lineTo(9f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 6f)
        lineTo(15f, 13.5f)
        moveTo(17f, 20f)
        lineTo(15f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(11f)
        moveTo(12f, 22f)
        verticalLineTo(18f)
        }
        }.build()

        return _blackHole01!!
    }

private var _blackHole01: ImageVector? = null
