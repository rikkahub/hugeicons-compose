package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Scissor01: ImageVector
    get() {
        if (_scissor01 != null) {
            return _scissor01!!
        }
        _scissor01 = ImageVector.Builder(
            name = "Scissor01",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.4368f, 9.55807f)
        lineTo(10.6f, 12f)
        moveTo(10.6f, 12f)
        lineTo(7f, 15f)
        moveTo(10.6f, 12f)
        lineTo(13.4949f, 14.3865f)
        moveTo(10.6f, 12f)
        lineTo(7f, 9f)
        moveTo(16f, 8.5f)
        curveTo(16f, 9.32843f, 15.3284f, 10f, 14.5f, 10f)
        curveTo(13.6716f, 10f, 13f, 9.32843f, 13f, 8.5f)
        curveTo(13f, 7.67157f, 13.6716f, 7f, 14.5f, 7f)
        curveTo(15.3284f, 7f, 16f, 7.67157f, 16f, 8.5f)
        moveTo(16f, 15.5f)
        curveTo(16f, 16.3284f, 15.3284f, 17f, 14.5f, 17f)
        curveTo(13.6716f, 17f, 13f, 16.3284f, 13f, 15.5f)
        curveTo(13f, 14.6716f, 13.6716f, 14f, 14.5f, 14f)
        curveTo(15.3284f, 14f, 16f, 14.6716f, 16f, 15.5f)
        }
        }.build()

        return _scissor01!!
    }

private var _scissor01: ImageVector? = null
