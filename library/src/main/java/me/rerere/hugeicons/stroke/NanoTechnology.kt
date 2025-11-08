package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NanoTechnology: ImageVector
    get() {
        if (_nanoTechnology != null) {
            return _nanoTechnology!!
        }
        _nanoTechnology = ImageVector.Builder(
            name = "NanoTechnology",
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
        moveTo(5f, 16f)
        lineTo(10f, 13f)
        moveTo(14f, 11f)
        lineTo(19f, 8f)
        moveTo(12f, 5f)
        verticalLineTo(10f)
        moveTo(12f, 14f)
        verticalLineTo(19f)
        moveTo(5f, 8f)
        lineTo(10f, 11f)
        moveTo(14f, 13f)
        lineTo(19f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 9.00001f)
        verticalLineTo(14.5f)
        moveTo(13.5f, 20.5f)
        lineTo(19f, 17.5f)
        moveTo(4.5f, 17.5f)
        lineTo(10.5f, 20.5f)
        moveTo(3.5f, 15f)
        verticalLineTo(9.00001f)
        moveTo(4.5f, 6.5f)
        lineTo(10.5f, 3.5f)
        moveTo(19.5f, 6.5f)
        lineTo(13.5f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9.75f)
        lineTo(14f, 10.875f)
        verticalLineTo(13.125f)
        lineTo(12f, 14.25f)
        lineTo(10f, 13.125f)
        verticalLineTo(10.875f)
        lineTo(12f, 9.75f)
        }
        }.build()

        return _nanoTechnology!!
    }

private var _nanoTechnology: ImageVector? = null
