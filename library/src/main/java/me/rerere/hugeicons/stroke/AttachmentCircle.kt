package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AttachmentCircle: ImageVector
    get() {
        if (_attachmentCircle != null) {
            return _attachmentCircle!!
        }
        _attachmentCircle = ImageVector.Builder(
            name = "AttachmentCircle",
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

        return _attachmentCircle!!
    }

private var _attachmentCircle: ImageVector? = null
