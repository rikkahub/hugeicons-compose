package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Billiard01: ImageVector
    get() {
        if (_billiard01 != null) {
            return _billiard01!!
        }
        _billiard01 = ImageVector.Builder(
            name = "Billiard01",
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
        moveTo(8.07089f, 10f)
        curveTo(8.02417f, 9.6734f, 8f, 9.33952f, 8f, 9f)
        curveTo(8f, 5.13401f, 11.134f, 2f, 15f, 2f)
        curveTo(18.866f, 2f, 22f, 5.13401f, 22f, 9f)
        curveTo(22f, 12.866f, 18.866f, 16f, 15f, 16f)
        curveTo(14.7024f, 16f, 14.4091f, 15.9814f, 14.1212f, 15.9454f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8684f, 10f)
        curveTo(19.2035f, 8.6899f, 18.8933f, 7.01849f, 18f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 19.0966f)
        lineTo(10.2253f, 11.5568f)
        moveTo(4.90338f, 22f)
        lineTo(12.6046f, 13.5987f)
        moveTo(12.6046f, 13.5987f)
        curveTo(12.6046f, 12.3221f, 11.677f, 11.3543f, 10.2253f, 11.5568f)
        moveTo(12.6046f, 13.5987f)
        lineTo(14.6243f, 11.3954f)
        curveTo(15.1414f, 10.8312f, 15.1225f, 9.95985f, 14.5813f, 9.41868f)
        curveTo(14.0402f, 8.87752f, 13.1688f, 8.85858f, 12.6046f, 9.37573f)
        lineTo(10.2253f, 11.5568f)
        }
        }.build()

        return _billiard01!!
    }

private var _billiard01: ImageVector? = null
