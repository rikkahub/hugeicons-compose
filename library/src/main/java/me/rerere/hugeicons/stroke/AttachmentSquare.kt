package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AttachmentSquare: ImageVector
    get() {
        if (_attachmentSquare != null) {
            return _attachmentSquare!!
        }
        _attachmentSquare = ImageVector.Builder(
            name = "AttachmentSquare",
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
        moveTo(8.56854f, 12f)
        lineTo(7.71068f, 11.1421f)
        curveTo(6.76311f, 10.1946f, 6.76311f, 8.65825f, 7.71068f, 7.71068f)
        curveTo(8.65825f, 6.76311f, 10.1946f, 6.76311f, 11.1421f, 7.71068f)
        lineTo(16.2893f, 12.8579f)
        curveTo(17.2369f, 13.8054f, 17.2369f, 15.3418f, 16.2893f, 16.2893f)
        curveTo(15.3418f, 17.2369f, 13.8054f, 17.2369f, 12.8579f, 16.2893f)
        lineTo(10.9277f, 14.3591f)
        curveTo(9.51688f, 12.9483f, 11.5463f, 11.0463f, 13f, 12.5f)
        lineTo(14f, 13.5f)
        }
        }.build()

        return _attachmentSquare!!
    }

private var _attachmentSquare: ImageVector? = null
