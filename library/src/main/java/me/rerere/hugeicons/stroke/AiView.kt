package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiView: ImageVector
    get() {
        if (_aiView != null) {
            return _aiView!!
        }
        _aiView = ImageVector.Builder(
            name = "AiView",
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
        moveTo(4.75f, 2.75f)
        lineTo(7f, 5f)
        lineTo(7f, 8f)
        moveTo(4.75f, 3.5f)
        curveTo(5.16421f, 3.5f, 5.5f, 3.16421f, 5.5f, 2.75f)
        curveTo(5.5f, 2.33579f, 5.16421f, 2f, 4.75f, 2f)
        curveTo(4.33579f, 2f, 4f, 2.33579f, 4f, 2.75f)
        curveTo(4f, 3.16421f, 4.33579f, 3.5f, 4.75f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.25f, 2.75f)
        lineTo(17f, 5f)
        lineTo(17f, 8f)
        moveTo(19.25f, 3.5f)
        curveTo(18.8358f, 3.5f, 18.5f, 3.16421f, 18.5f, 2.75f)
        curveTo(18.5f, 2.33579f, 18.8358f, 2f, 19.25f, 2f)
        curveTo(19.6642f, 2f, 20f, 2.33579f, 20f, 2.75f)
        curveTo(20f, 3.16421f, 19.6642f, 3.5f, 19.25f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.75f)
        lineTo(12f, 7f)
        moveTo(12f, 3.5f)
        curveTo(12.4142f, 3.5f, 12.75f, 3.16421f, 12.75f, 2.75f)
        curveTo(12.75f, 2.33579f, 12.4142f, 2f, 12f, 2f)
        curveTo(11.5858f, 2f, 11.25f, 2.33579f, 11.25f, 2.75f)
        curveTo(11.25f, 3.16421f, 11.5858f, 3.5f, 12f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 16f)
        curveTo(15f, 14.3431f, 13.6569f, 13f, 12f, 13f)
        curveTo(10.3431f, 13f, 9f, 14.3431f, 9f, 16f)
        curveTo(9f, 17.6569f, 10.3431f, 19f, 12f, 19f)
        curveTo(13.6569f, 19f, 15f, 17.6569f, 15f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        curveTo(18f, 10f, 22f, 16f, 22f, 16f)
        curveTo(22f, 16f, 18f, 22f, 12f, 22f)
        curveTo(6f, 22f, 2f, 16f, 2f, 16f)
        curveTo(2f, 16f, 6f, 10f, 12f, 10f)
        }
        }.build()

        return _aiView!!
    }

private var _aiView: ImageVector? = null
