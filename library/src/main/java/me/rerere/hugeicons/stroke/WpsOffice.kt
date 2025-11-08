package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WpsOffice: ImageVector
    get() {
        if (_wpsOffice != null) {
            return _wpsOffice!!
        }
        _wpsOffice = ImageVector.Builder(
            name = "WpsOffice",
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
        moveTo(13.5f, 14.5f)
        lineTo(15.5f, 18.5f)
        lineTo(22f, 5.5f)
        horizontalLineTo(15f)
        lineTo(12f, 11.5f)
        lineTo(8.5f, 18.5f)
        lineTo(2f, 5.5f)
        horizontalLineTo(9f)
        lineTo(10.5f, 8.5f)
        }
        }.build()

        return _wpsOffice!!
    }

private var _wpsOffice: ImageVector? = null
